// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDevicesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicesPlainArgs Empty = new GetDevicesPlainArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    private GetDevicesPlainArgs() {}

    private GetDevicesPlainArgs(GetDevicesPlainArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicesPlainArgs $;

        public Builder() {
            $ = new GetDevicesPlainArgs();
        }

        public Builder(GetDevicesPlainArgs defaults) {
            $ = new GetDevicesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public GetDevicesPlainArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            return $;
        }
    }

}
