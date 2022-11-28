// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ApiShieldAuthIdCharacteristicArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldState extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldState Empty = new ApiShieldState();

    /**
     * Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     * 
     */
    @Import(name="authIdCharacteristics")
    private @Nullable Output<List<ApiShieldAuthIdCharacteristicArgs>> authIdCharacteristics;

    /**
     * @return Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     * 
     */
    public Optional<Output<List<ApiShieldAuthIdCharacteristicArgs>>> authIdCharacteristics() {
        return Optional.ofNullable(this.authIdCharacteristics);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ApiShieldState() {}

    private ApiShieldState(ApiShieldState $) {
        this.authIdCharacteristics = $.authIdCharacteristics;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldState $;

        public Builder() {
            $ = new ApiShieldState();
        }

        public Builder(ApiShieldState defaults) {
            $ = new ApiShieldState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authIdCharacteristics Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
         * 
         * @return builder
         * 
         */
        public Builder authIdCharacteristics(@Nullable Output<List<ApiShieldAuthIdCharacteristicArgs>> authIdCharacteristics) {
            $.authIdCharacteristics = authIdCharacteristics;
            return this;
        }

        /**
         * @param authIdCharacteristics Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
         * 
         * @return builder
         * 
         */
        public Builder authIdCharacteristics(List<ApiShieldAuthIdCharacteristicArgs> authIdCharacteristics) {
            return authIdCharacteristics(Output.of(authIdCharacteristics));
        }

        /**
         * @param authIdCharacteristics Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
         * 
         * @return builder
         * 
         */
        public Builder authIdCharacteristics(ApiShieldAuthIdCharacteristicArgs... authIdCharacteristics) {
            return authIdCharacteristics(List.of(authIdCharacteristics));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ApiShieldState build() {
            return $;
        }
    }

}
