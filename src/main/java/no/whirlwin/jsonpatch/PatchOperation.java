package no.whirlwin.jsonpatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum PatchOperation {

    REPLACE("replace");

    private static final Map<String, PatchOperation> stringToPatchOperationsMap = new HashMap<>();

    private final String name;

    static {
        Arrays.asList(PatchOperation.values())
                .stream()
                .forEach(operation -> stringToPatchOperationsMap.put(operation.name, operation));
    }

    PatchOperation(final String name) {
        this.name = name;
    }

    public static Optional<PatchOperation> fromString(final String name) {
        return Optional.ofNullable(stringToPatchOperationsMap.get(name));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
