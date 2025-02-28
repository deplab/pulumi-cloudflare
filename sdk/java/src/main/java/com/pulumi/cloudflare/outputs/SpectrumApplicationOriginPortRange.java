// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SpectrumApplicationOriginPortRange {
    /**
     * @return Upper bound of the origin port range.
     * 
     */
    private Integer end;
    /**
     * @return Lower bound of the origin port range.
     * 
     */
    private Integer start;

    private SpectrumApplicationOriginPortRange() {}
    /**
     * @return Upper bound of the origin port range.
     * 
     */
    public Integer end() {
        return this.end;
    }
    /**
     * @return Lower bound of the origin port range.
     * 
     */
    public Integer start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpectrumApplicationOriginPortRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer end;
        private Integer start;
        public Builder() {}
        public Builder(SpectrumApplicationOriginPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder end(Integer end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        @CustomType.Setter
        public Builder start(Integer start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public SpectrumApplicationOriginPortRange build() {
            final var o = new SpectrumApplicationOriginPortRange();
            o.end = end;
            o.start = start;
            return o;
        }
    }
}
