package no.whirlwin.jsonpatch;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class OpValidator extends JsonDeserializer<PatchOperation> {

    @Override
    public PatchOperation deserialize(final JsonParser jsonParser,
                                      final DeserializationContext deserializationContext) throws IOException {
        final String operation = jsonParser.getValueAsString();
        return PatchOperation.fromString(operation).orElseThrow(() ->
                new IllegalArgumentException("Failed to convert PatchOperation for value " + operation));
    }
}
