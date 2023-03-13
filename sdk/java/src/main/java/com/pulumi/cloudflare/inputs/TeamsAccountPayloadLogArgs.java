// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TeamsAccountPayloadLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsAccountPayloadLogArgs Empty = new TeamsAccountPayloadLogArgs();

    /**
     * Public key used to encrypt matched payloads.
     * 
     */
    @Import(name="publicKey", required=true)
    private Output<String> publicKey;

    /**
     * @return Public key used to encrypt matched payloads.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }

    private TeamsAccountPayloadLogArgs() {}

    private TeamsAccountPayloadLogArgs(TeamsAccountPayloadLogArgs $) {
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsAccountPayloadLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsAccountPayloadLogArgs $;

        public Builder() {
            $ = new TeamsAccountPayloadLogArgs();
        }

        public Builder(TeamsAccountPayloadLogArgs defaults) {
            $ = new TeamsAccountPayloadLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKey Public key used to encrypt matched payloads.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey Public key used to encrypt matched payloads.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public TeamsAccountPayloadLogArgs build() {
            $.publicKey = Objects.requireNonNull($.publicKey, "expected parameter 'publicKey' to be non-null");
            return $;
        }
    }

}
