// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AccessPolicyIncludeAuthContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyIncludeAuthContextArgs Empty = new AccessPolicyIncludeAuthContextArgs();

    @Import(name="acId", required=true)
    private Output<String> acId;

    public Output<String> acId() {
        return this.acId;
    }

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of this resource.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="identityProviderId", required=true)
    private Output<String> identityProviderId;

    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }

    private AccessPolicyIncludeAuthContextArgs() {}

    private AccessPolicyIncludeAuthContextArgs(AccessPolicyIncludeAuthContextArgs $) {
        this.acId = $.acId;
        this.id = $.id;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyIncludeAuthContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyIncludeAuthContextArgs $;

        public Builder() {
            $ = new AccessPolicyIncludeAuthContextArgs();
        }

        public Builder(AccessPolicyIncludeAuthContextArgs defaults) {
            $ = new AccessPolicyIncludeAuthContextArgs(Objects.requireNonNull(defaults));
        }

        public Builder acId(Output<String> acId) {
            $.acId = acId;
            return this;
        }

        public Builder acId(String acId) {
            return acId(Output.of(acId));
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder identityProviderId(Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public AccessPolicyIncludeAuthContextArgs build() {
            $.acId = Objects.requireNonNull($.acId, "expected parameter 'acId' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.identityProviderId = Objects.requireNonNull($.identityProviderId, "expected parameter 'identityProviderId' to be non-null");
            return $;
        }
    }

}
