// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs;
import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs;
import com.pulumi.cloudflare.inputs.PagesProjectSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectState extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectState Empty = new PagesProjectState();

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
     * Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     * 
     */
    @Import(name="buildConfig")
    private @Nullable Output<PagesProjectBuildConfigArgs> buildConfig;

    /**
     * @return Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     * 
     */
    public Optional<Output<PagesProjectBuildConfigArgs>> buildConfig() {
        return Optional.ofNullable(this.buildConfig);
    }

    /**
     * When the project was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return When the project was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Configuration for deployments in a project.
     * 
     */
    @Import(name="deploymentConfigs")
    private @Nullable Output<PagesProjectDeploymentConfigsArgs> deploymentConfigs;

    /**
     * @return Configuration for deployments in a project.
     * 
     */
    public Optional<Output<PagesProjectDeploymentConfigsArgs>> deploymentConfigs() {
        return Optional.ofNullable(this.deploymentConfigs);
    }

    /**
     * A list of associated custom domains for the project.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return A list of associated custom domains for the project.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Name of the project. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the project. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the branch that is used for the production environment.
     * 
     */
    @Import(name="productionBranch")
    private @Nullable Output<String> productionBranch;

    /**
     * @return The name of the branch that is used for the production environment.
     * 
     */
    public Optional<Output<String>> productionBranch() {
        return Optional.ofNullable(this.productionBranch);
    }

    /**
     * Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     * 
     */
    @Import(name="source")
    private @Nullable Output<PagesProjectSourceArgs> source;

    /**
     * @return Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     * 
     */
    public Optional<Output<PagesProjectSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The Cloudflare subdomain associated with the project.
     * 
     */
    @Import(name="subdomain")
    private @Nullable Output<String> subdomain;

    /**
     * @return The Cloudflare subdomain associated with the project.
     * 
     */
    public Optional<Output<String>> subdomain() {
        return Optional.ofNullable(this.subdomain);
    }

    private PagesProjectState() {}

    private PagesProjectState(PagesProjectState $) {
        this.accountId = $.accountId;
        this.buildConfig = $.buildConfig;
        this.createdOn = $.createdOn;
        this.deploymentConfigs = $.deploymentConfigs;
        this.domains = $.domains;
        this.name = $.name;
        this.productionBranch = $.productionBranch;
        this.source = $.source;
        this.subdomain = $.subdomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectState $;

        public Builder() {
            $ = new PagesProjectState();
        }

        public Builder(PagesProjectState defaults) {
            $ = new PagesProjectState(Objects.requireNonNull(defaults));
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
         * @param buildConfig Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
         * 
         * @return builder
         * 
         */
        public Builder buildConfig(@Nullable Output<PagesProjectBuildConfigArgs> buildConfig) {
            $.buildConfig = buildConfig;
            return this;
        }

        /**
         * @param buildConfig Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
         * 
         * @return builder
         * 
         */
        public Builder buildConfig(PagesProjectBuildConfigArgs buildConfig) {
            return buildConfig(Output.of(buildConfig));
        }

        /**
         * @param createdOn When the project was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn When the project was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param deploymentConfigs Configuration for deployments in a project.
         * 
         * @return builder
         * 
         */
        public Builder deploymentConfigs(@Nullable Output<PagesProjectDeploymentConfigsArgs> deploymentConfigs) {
            $.deploymentConfigs = deploymentConfigs;
            return this;
        }

        /**
         * @param deploymentConfigs Configuration for deployments in a project.
         * 
         * @return builder
         * 
         */
        public Builder deploymentConfigs(PagesProjectDeploymentConfigsArgs deploymentConfigs) {
            return deploymentConfigs(Output.of(deploymentConfigs));
        }

        /**
         * @param domains A list of associated custom domains for the project.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains A list of associated custom domains for the project.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains A list of associated custom domains for the project.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param name Name of the project. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the project. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productionBranch The name of the branch that is used for the production environment.
         * 
         * @return builder
         * 
         */
        public Builder productionBranch(@Nullable Output<String> productionBranch) {
            $.productionBranch = productionBranch;
            return this;
        }

        /**
         * @param productionBranch The name of the branch that is used for the production environment.
         * 
         * @return builder
         * 
         */
        public Builder productionBranch(String productionBranch) {
            return productionBranch(Output.of(productionBranch));
        }

        /**
         * @param source Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<PagesProjectSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
         * 
         * @return builder
         * 
         */
        public Builder source(PagesProjectSourceArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param subdomain The Cloudflare subdomain associated with the project.
         * 
         * @return builder
         * 
         */
        public Builder subdomain(@Nullable Output<String> subdomain) {
            $.subdomain = subdomain;
            return this;
        }

        /**
         * @param subdomain The Cloudflare subdomain associated with the project.
         * 
         * @return builder
         * 
         */
        public Builder subdomain(String subdomain) {
            return subdomain(Output.of(subdomain));
        }

        public PagesProjectState build() {
            return $;
        }
    }

}
