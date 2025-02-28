// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOriginCaRootCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOriginCaRootCertificateArgs Empty = new GetOriginCaRootCertificateArgs();

    /**
     * The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
     * 
     */
    @Import(name="algorithm", required=true)
    private Output<String> algorithm;

    /**
     * @return The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }

    private GetOriginCaRootCertificateArgs() {}

    private GetOriginCaRootCertificateArgs(GetOriginCaRootCertificateArgs $) {
        this.algorithm = $.algorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOriginCaRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOriginCaRootCertificateArgs $;

        public Builder() {
            $ = new GetOriginCaRootCertificateArgs();
        }

        public Builder(GetOriginCaRootCertificateArgs defaults) {
            $ = new GetOriginCaRootCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public GetOriginCaRootCertificateArgs build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            return $;
        }
    }

}
