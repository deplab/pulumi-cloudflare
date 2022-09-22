// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.LoadBalancerRuleOverrideCountryPool;
import com.pulumi.cloudflare.outputs.LoadBalancerRuleOverridePopPool;
import com.pulumi.cloudflare.outputs.LoadBalancerRuleOverrideRegionPool;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerRuleOverride {
    /**
     * @return See country_pools above.
     * 
     */
    private @Nullable List<LoadBalancerRuleOverrideCountryPool> countryPools;
    /**
     * @return See default_pool_ids above.
     * 
     */
    private @Nullable List<String> defaultPools;
    /**
     * @return See fallback_pool_id above.
     * 
     */
    private @Nullable String fallbackPool;
    /**
     * @return See pop_pools above.
     * 
     */
    private @Nullable List<LoadBalancerRuleOverridePopPool> popPools;
    /**
     * @return See region_pools above.
     * 
     */
    private @Nullable List<LoadBalancerRuleOverrideRegionPool> regionPools;
    /**
     * @return See field above.
     * 
     */
    private @Nullable String sessionAffinity;
    /**
     * @return See field above.
     * 
     */
    private @Nullable Map<String,String> sessionAffinityAttributes;
    /**
     * @return See field above.
     * 
     */
    private @Nullable Integer sessionAffinityTtl;
    /**
     * @return See field above.
     * 
     */
    private @Nullable String steeringPolicy;
    /**
     * @return See field above.
     * 
     */
    private @Nullable Integer ttl;

    private LoadBalancerRuleOverride() {}
    /**
     * @return See country_pools above.
     * 
     */
    public List<LoadBalancerRuleOverrideCountryPool> countryPools() {
        return this.countryPools == null ? List.of() : this.countryPools;
    }
    /**
     * @return See default_pool_ids above.
     * 
     */
    public List<String> defaultPools() {
        return this.defaultPools == null ? List.of() : this.defaultPools;
    }
    /**
     * @return See fallback_pool_id above.
     * 
     */
    public Optional<String> fallbackPool() {
        return Optional.ofNullable(this.fallbackPool);
    }
    /**
     * @return See pop_pools above.
     * 
     */
    public List<LoadBalancerRuleOverridePopPool> popPools() {
        return this.popPools == null ? List.of() : this.popPools;
    }
    /**
     * @return See region_pools above.
     * 
     */
    public List<LoadBalancerRuleOverrideRegionPool> regionPools() {
        return this.regionPools == null ? List.of() : this.regionPools;
    }
    /**
     * @return See field above.
     * 
     */
    public Optional<String> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }
    /**
     * @return See field above.
     * 
     */
    public Map<String,String> sessionAffinityAttributes() {
        return this.sessionAffinityAttributes == null ? Map.of() : this.sessionAffinityAttributes;
    }
    /**
     * @return See field above.
     * 
     */
    public Optional<Integer> sessionAffinityTtl() {
        return Optional.ofNullable(this.sessionAffinityTtl);
    }
    /**
     * @return See field above.
     * 
     */
    public Optional<String> steeringPolicy() {
        return Optional.ofNullable(this.steeringPolicy);
    }
    /**
     * @return See field above.
     * 
     */
    public Optional<Integer> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerRuleOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LoadBalancerRuleOverrideCountryPool> countryPools;
        private @Nullable List<String> defaultPools;
        private @Nullable String fallbackPool;
        private @Nullable List<LoadBalancerRuleOverridePopPool> popPools;
        private @Nullable List<LoadBalancerRuleOverrideRegionPool> regionPools;
        private @Nullable String sessionAffinity;
        private @Nullable Map<String,String> sessionAffinityAttributes;
        private @Nullable Integer sessionAffinityTtl;
        private @Nullable String steeringPolicy;
        private @Nullable Integer ttl;
        public Builder() {}
        public Builder(LoadBalancerRuleOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryPools = defaults.countryPools;
    	      this.defaultPools = defaults.defaultPools;
    	      this.fallbackPool = defaults.fallbackPool;
    	      this.popPools = defaults.popPools;
    	      this.regionPools = defaults.regionPools;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.sessionAffinityAttributes = defaults.sessionAffinityAttributes;
    	      this.sessionAffinityTtl = defaults.sessionAffinityTtl;
    	      this.steeringPolicy = defaults.steeringPolicy;
    	      this.ttl = defaults.ttl;
        }

        @CustomType.Setter
        public Builder countryPools(@Nullable List<LoadBalancerRuleOverrideCountryPool> countryPools) {
            this.countryPools = countryPools;
            return this;
        }
        public Builder countryPools(LoadBalancerRuleOverrideCountryPool... countryPools) {
            return countryPools(List.of(countryPools));
        }
        @CustomType.Setter
        public Builder defaultPools(@Nullable List<String> defaultPools) {
            this.defaultPools = defaultPools;
            return this;
        }
        public Builder defaultPools(String... defaultPools) {
            return defaultPools(List.of(defaultPools));
        }
        @CustomType.Setter
        public Builder fallbackPool(@Nullable String fallbackPool) {
            this.fallbackPool = fallbackPool;
            return this;
        }
        @CustomType.Setter
        public Builder popPools(@Nullable List<LoadBalancerRuleOverridePopPool> popPools) {
            this.popPools = popPools;
            return this;
        }
        public Builder popPools(LoadBalancerRuleOverridePopPool... popPools) {
            return popPools(List.of(popPools));
        }
        @CustomType.Setter
        public Builder regionPools(@Nullable List<LoadBalancerRuleOverrideRegionPool> regionPools) {
            this.regionPools = regionPools;
            return this;
        }
        public Builder regionPools(LoadBalancerRuleOverrideRegionPool... regionPools) {
            return regionPools(List.of(regionPools));
        }
        @CustomType.Setter
        public Builder sessionAffinity(@Nullable String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        @CustomType.Setter
        public Builder sessionAffinityAttributes(@Nullable Map<String,String> sessionAffinityAttributes) {
            this.sessionAffinityAttributes = sessionAffinityAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder sessionAffinityTtl(@Nullable Integer sessionAffinityTtl) {
            this.sessionAffinityTtl = sessionAffinityTtl;
            return this;
        }
        @CustomType.Setter
        public Builder steeringPolicy(@Nullable String steeringPolicy) {
            this.steeringPolicy = steeringPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public LoadBalancerRuleOverride build() {
            final var o = new LoadBalancerRuleOverride();
            o.countryPools = countryPools;
            o.defaultPools = defaultPools;
            o.fallbackPool = fallbackPool;
            o.popPools = popPools;
            o.regionPools = regionPools;
            o.sessionAffinity = sessionAffinity;
            o.sessionAffinityAttributes = sessionAffinityAttributes;
            o.sessionAffinityTtl = sessionAffinityTtl;
            o.steeringPolicy = steeringPolicy;
            o.ttl = ttl;
            return o;
        }
    }
}