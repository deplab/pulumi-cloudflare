// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpectrumApplicationOriginDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpectrumApplicationOriginDnsArgs Empty = new SpectrumApplicationOriginDnsArgs();

    /**
     * Fully qualified domain name of the origin.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Fully qualified domain name of the origin.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private SpectrumApplicationOriginDnsArgs() {}

    private SpectrumApplicationOriginDnsArgs(SpectrumApplicationOriginDnsArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpectrumApplicationOriginDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpectrumApplicationOriginDnsArgs $;

        public Builder() {
            $ = new SpectrumApplicationOriginDnsArgs();
        }

        public Builder(SpectrumApplicationOriginDnsArgs defaults) {
            $ = new SpectrumApplicationOriginDnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Fully qualified domain name of the origin.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Fully qualified domain name of the origin.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SpectrumApplicationOriginDnsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
