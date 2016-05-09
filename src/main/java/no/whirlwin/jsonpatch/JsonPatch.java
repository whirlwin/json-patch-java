package no.whirlwin.jsonpatch;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The patch approach is described in the following RFC: https://tools.ietf.org/html/rfc5789
 */
public final class JsonPatch<T> {

    @JsonDeserialize(using = OpValidator.class)
    private PatchOperation op;
    private String path;
    private T value;

    public PatchOperation getOp() {
        return op;
    }

    public void setOp(final PatchOperation op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public T getValue() {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "JsonPatch{" +
                "op=" + op +
                ", path='" + path + '\'' +
                ", value=" + value +
                '}';
    }
}
