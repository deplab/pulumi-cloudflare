// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceSettingsPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final DeviceSettingsPolicyState Empty = new DeviceSettingsPolicyState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Whether to allow mode switch for this policy.
     * 
     */
    @Import(name="allowModeSwitch")
    private @Nullable Output<Boolean> allowModeSwitch;

    /**
     * @return Whether to allow mode switch for this policy.
     * 
     */
    public Optional<Output<Boolean>> allowModeSwitch() {
        return Optional.ofNullable(this.allowModeSwitch);
    }

    /**
     * Whether to allow updates under this policy.
     * 
     */
    @Import(name="allowUpdates")
    private @Nullable Output<Boolean> allowUpdates;

    /**
     * @return Whether to allow updates under this policy.
     * 
     */
    public Optional<Output<Boolean>> allowUpdates() {
        return Optional.ofNullable(this.allowUpdates);
    }

    /**
     * Whether to allow devices to leave the organization. Defaults to `true`.
     * 
     */
    @Import(name="allowedToLeave")
    private @Nullable Output<Boolean> allowedToLeave;

    /**
     * @return Whether to allow devices to leave the organization. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> allowedToLeave() {
        return Optional.ofNullable(this.allowedToLeave);
    }

    /**
     * The amount of time in minutes to reconnect after having been disabled.
     * 
     */
    @Import(name="autoConnect")
    private @Nullable Output<Integer> autoConnect;

    /**
     * @return The amount of time in minutes to reconnect after having been disabled.
     * 
     */
    public Optional<Output<Integer>> autoConnect() {
        return Optional.ofNullable(this.autoConnect);
    }

    /**
     * The captive portal value for this policy. Defaults to `180`.
     * 
     */
    @Import(name="captivePortal")
    private @Nullable Output<Integer> captivePortal;

    /**
     * @return The captive portal value for this policy. Defaults to `180`.
     * 
     */
    public Optional<Output<Integer>> captivePortal() {
        return Optional.ofNullable(this.captivePortal);
    }

    /**
     * Whether the policy refers to the default account policy.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Whether the policy refers to the default account policy.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Description of Policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of Policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to disable auto fallback for this policy.
     * 
     */
    @Import(name="disableAutoFallback")
    private @Nullable Output<Boolean> disableAutoFallback;

    /**
     * @return Whether to disable auto fallback for this policy.
     * 
     */
    public Optional<Output<Boolean>> disableAutoFallback() {
        return Optional.ofNullable(this.disableAutoFallback);
    }

    /**
     * Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Whether to add Microsoft IPs to split tunnel exclusions.
     * 
     */
    @Import(name="excludeOfficeIps")
    private @Nullable Output<Boolean> excludeOfficeIps;

    /**
     * @return Whether to add Microsoft IPs to split tunnel exclusions.
     * 
     */
    public Optional<Output<Boolean>> excludeOfficeIps() {
        return Optional.ofNullable(this.excludeOfficeIps);
    }

    /**
     * Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     * 
     */
    @Import(name="match")
    private @Nullable Output<String> match;

    /**
     * @return Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     * 
     */
    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * Name of the policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The precedence of the policy. Lower values indicate higher precedence.
     * 
     */
    @Import(name="precedence")
    private @Nullable Output<Integer> precedence;

    /**
     * @return The precedence of the policy. Lower values indicate higher precedence.
     * 
     */
    public Optional<Output<Integer>> precedence() {
        return Optional.ofNullable(this.precedence);
    }

    /**
     * The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
     * 
     */
    @Import(name="serviceModeV2Mode")
    private @Nullable Output<String> serviceModeV2Mode;

    /**
     * @return The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
     * 
     */
    public Optional<Output<String>> serviceModeV2Mode() {
        return Optional.ofNullable(this.serviceModeV2Mode);
    }

    /**
     * The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
     * 
     */
    @Import(name="serviceModeV2Port")
    private @Nullable Output<Integer> serviceModeV2Port;

    /**
     * @return The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
     * 
     */
    public Optional<Output<Integer>> serviceModeV2Port() {
        return Optional.ofNullable(this.serviceModeV2Port);
    }

    /**
     * The support URL that will be opened when sending feedback.
     * 
     */
    @Import(name="supportUrl")
    private @Nullable Output<String> supportUrl;

    /**
     * @return The support URL that will be opened when sending feedback.
     * 
     */
    public Optional<Output<String>> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    /**
     * Enablement of the ZT client switch lock.
     * 
     */
    @Import(name="switchLocked")
    private @Nullable Output<Boolean> switchLocked;

    /**
     * @return Enablement of the ZT client switch lock.
     * 
     */
    public Optional<Output<Boolean>> switchLocked() {
        return Optional.ofNullable(this.switchLocked);
    }

    private DeviceSettingsPolicyState() {}

    private DeviceSettingsPolicyState(DeviceSettingsPolicyState $) {
        this.accountId = $.accountId;
        this.allowModeSwitch = $.allowModeSwitch;
        this.allowUpdates = $.allowUpdates;
        this.allowedToLeave = $.allowedToLeave;
        this.autoConnect = $.autoConnect;
        this.captivePortal = $.captivePortal;
        this.default_ = $.default_;
        this.description = $.description;
        this.disableAutoFallback = $.disableAutoFallback;
        this.enabled = $.enabled;
        this.excludeOfficeIps = $.excludeOfficeIps;
        this.match = $.match;
        this.name = $.name;
        this.precedence = $.precedence;
        this.serviceModeV2Mode = $.serviceModeV2Mode;
        this.serviceModeV2Port = $.serviceModeV2Port;
        this.supportUrl = $.supportUrl;
        this.switchLocked = $.switchLocked;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceSettingsPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceSettingsPolicyState $;

        public Builder() {
            $ = new DeviceSettingsPolicyState();
        }

        public Builder(DeviceSettingsPolicyState defaults) {
            $ = new DeviceSettingsPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowModeSwitch Whether to allow mode switch for this policy.
         * 
         * @return builder
         * 
         */
        public Builder allowModeSwitch(@Nullable Output<Boolean> allowModeSwitch) {
            $.allowModeSwitch = allowModeSwitch;
            return this;
        }

        /**
         * @param allowModeSwitch Whether to allow mode switch for this policy.
         * 
         * @return builder
         * 
         */
        public Builder allowModeSwitch(Boolean allowModeSwitch) {
            return allowModeSwitch(Output.of(allowModeSwitch));
        }

        /**
         * @param allowUpdates Whether to allow updates under this policy.
         * 
         * @return builder
         * 
         */
        public Builder allowUpdates(@Nullable Output<Boolean> allowUpdates) {
            $.allowUpdates = allowUpdates;
            return this;
        }

        /**
         * @param allowUpdates Whether to allow updates under this policy.
         * 
         * @return builder
         * 
         */
        public Builder allowUpdates(Boolean allowUpdates) {
            return allowUpdates(Output.of(allowUpdates));
        }

        /**
         * @param allowedToLeave Whether to allow devices to leave the organization. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder allowedToLeave(@Nullable Output<Boolean> allowedToLeave) {
            $.allowedToLeave = allowedToLeave;
            return this;
        }

        /**
         * @param allowedToLeave Whether to allow devices to leave the organization. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder allowedToLeave(Boolean allowedToLeave) {
            return allowedToLeave(Output.of(allowedToLeave));
        }

        /**
         * @param autoConnect The amount of time in minutes to reconnect after having been disabled.
         * 
         * @return builder
         * 
         */
        public Builder autoConnect(@Nullable Output<Integer> autoConnect) {
            $.autoConnect = autoConnect;
            return this;
        }

        /**
         * @param autoConnect The amount of time in minutes to reconnect after having been disabled.
         * 
         * @return builder
         * 
         */
        public Builder autoConnect(Integer autoConnect) {
            return autoConnect(Output.of(autoConnect));
        }

        /**
         * @param captivePortal The captive portal value for this policy. Defaults to `180`.
         * 
         * @return builder
         * 
         */
        public Builder captivePortal(@Nullable Output<Integer> captivePortal) {
            $.captivePortal = captivePortal;
            return this;
        }

        /**
         * @param captivePortal The captive portal value for this policy. Defaults to `180`.
         * 
         * @return builder
         * 
         */
        public Builder captivePortal(Integer captivePortal) {
            return captivePortal(Output.of(captivePortal));
        }

        /**
         * @param default_ Whether the policy refers to the default account policy.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Whether the policy refers to the default account policy.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param description Description of Policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of Policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disableAutoFallback Whether to disable auto fallback for this policy.
         * 
         * @return builder
         * 
         */
        public Builder disableAutoFallback(@Nullable Output<Boolean> disableAutoFallback) {
            $.disableAutoFallback = disableAutoFallback;
            return this;
        }

        /**
         * @param disableAutoFallback Whether to disable auto fallback for this policy.
         * 
         * @return builder
         * 
         */
        public Builder disableAutoFallback(Boolean disableAutoFallback) {
            return disableAutoFallback(Output.of(disableAutoFallback));
        }

        /**
         * @param enabled Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param excludeOfficeIps Whether to add Microsoft IPs to split tunnel exclusions.
         * 
         * @return builder
         * 
         */
        public Builder excludeOfficeIps(@Nullable Output<Boolean> excludeOfficeIps) {
            $.excludeOfficeIps = excludeOfficeIps;
            return this;
        }

        /**
         * @param excludeOfficeIps Whether to add Microsoft IPs to split tunnel exclusions.
         * 
         * @return builder
         * 
         */
        public Builder excludeOfficeIps(Boolean excludeOfficeIps) {
            return excludeOfficeIps(Output.of(excludeOfficeIps));
        }

        /**
         * @param match Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
         * 
         * @return builder
         * 
         */
        public Builder match(String match) {
            return match(Output.of(match));
        }

        /**
         * @param name Name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param precedence The precedence of the policy. Lower values indicate higher precedence.
         * 
         * @return builder
         * 
         */
        public Builder precedence(@Nullable Output<Integer> precedence) {
            $.precedence = precedence;
            return this;
        }

        /**
         * @param precedence The precedence of the policy. Lower values indicate higher precedence.
         * 
         * @return builder
         * 
         */
        public Builder precedence(Integer precedence) {
            return precedence(Output.of(precedence));
        }

        /**
         * @param serviceModeV2Mode The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
         * 
         * @return builder
         * 
         */
        public Builder serviceModeV2Mode(@Nullable Output<String> serviceModeV2Mode) {
            $.serviceModeV2Mode = serviceModeV2Mode;
            return this;
        }

        /**
         * @param serviceModeV2Mode The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
         * 
         * @return builder
         * 
         */
        public Builder serviceModeV2Mode(String serviceModeV2Mode) {
            return serviceModeV2Mode(Output.of(serviceModeV2Mode));
        }

        /**
         * @param serviceModeV2Port The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
         * 
         * @return builder
         * 
         */
        public Builder serviceModeV2Port(@Nullable Output<Integer> serviceModeV2Port) {
            $.serviceModeV2Port = serviceModeV2Port;
            return this;
        }

        /**
         * @param serviceModeV2Port The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
         * 
         * @return builder
         * 
         */
        public Builder serviceModeV2Port(Integer serviceModeV2Port) {
            return serviceModeV2Port(Output.of(serviceModeV2Port));
        }

        /**
         * @param supportUrl The support URL that will be opened when sending feedback.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(@Nullable Output<String> supportUrl) {
            $.supportUrl = supportUrl;
            return this;
        }

        /**
         * @param supportUrl The support URL that will be opened when sending feedback.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(String supportUrl) {
            return supportUrl(Output.of(supportUrl));
        }

        /**
         * @param switchLocked Enablement of the ZT client switch lock.
         * 
         * @return builder
         * 
         */
        public Builder switchLocked(@Nullable Output<Boolean> switchLocked) {
            $.switchLocked = switchLocked;
            return this;
        }

        /**
         * @param switchLocked Enablement of the ZT client switch lock.
         * 
         * @return builder
         * 
         */
        public Builder switchLocked(Boolean switchLocked) {
            return switchLocked(Output.of(switchLocked));
        }

        public DeviceSettingsPolicyState build() {
            return $;
        }
    }

}
