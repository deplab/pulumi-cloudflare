// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessGroupIncludeAuthContext {
    private String acId;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    private String identityProviderId;

    private AccessGroupIncludeAuthContext() {}
    public String acId() {
        return this.acId;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String identityProviderId() {
        return this.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessGroupIncludeAuthContext defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acId;
        private String id;
        private String identityProviderId;
        public Builder() {}
        public Builder(AccessGroupIncludeAuthContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acId = defaults.acId;
    	      this.id = defaults.id;
    	      this.identityProviderId = defaults.identityProviderId;
        }

        @CustomType.Setter
        public Builder acId(String acId) {
            this.acId = Objects.requireNonNull(acId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = Objects.requireNonNull(identityProviderId);
            return this;
        }
        public AccessGroupIncludeAuthContext build() {
            final var o = new AccessGroupIncludeAuthContext();
            o.acId = acId;
            o.id = id;
            o.identityProviderId = identityProviderId;
            return o;
        }
    }
}
