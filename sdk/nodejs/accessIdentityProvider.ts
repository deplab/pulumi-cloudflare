// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Identity Provider resource. Identity Providers are
 * used as an authentication or authorisation source within Access.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * // one time pin
 * const pinLogin = new cloudflare.AccessIdentityProvider("pinLogin", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     name: "PIN login",
 *     type: "onetimepin",
 * });
 * // oauth
 * const githubOauth = new cloudflare.AccessIdentityProvider("githubOauth", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     configs: [{
 *         clientId: "example",
 *         clientSecret: "secretKey",
 *     }],
 *     name: "GitHub OAuth",
 *     type: "github",
 * });
 * // saml
 * const jumpcloudSaml = new cloudflare.AccessIdentityProvider("jumpcloudSaml", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     configs: [{
 *         attributes: [
 *             "email",
 *             "username",
 *         ],
 *         idpPublicCert: `MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg
 * uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o`,
 *         issuerUrl: "jumpcloud",
 *         signRequest: false,
 *         ssoTargetUrl: "https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess",
 *     }],
 *     name: "JumpCloud SAML",
 *     type: "saml",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/access_identity_provider.html.markdown.
 */
export class AccessIdentityProvider extends pulumi.CustomResource {
    /**
     * Get an existing AccessIdentityProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessIdentityProviderState, opts?: pulumi.CustomResourceOptions): AccessIdentityProvider {
        return new AccessIdentityProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessIdentityProvider:AccessIdentityProvider';

    /**
     * Returns true if the given object is an instance of AccessIdentityProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessIdentityProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessIdentityProvider.__pulumiType;
    }

    public readonly accountId!: pulumi.Output<string>;
    /**
     * Provider configuration from the [developer documentation][accessIdentityProviderGuide].
     */
    public readonly configs!: pulumi.Output<outputs.AccessIdentityProviderConfig[] | undefined>;
    /**
     * Friendly name of the Access Identity Provider configuration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The provider type to use. Must be one of: `"centrify"`,
     * `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
     * `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AccessIdentityProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessIdentityProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessIdentityProviderArgs | AccessIdentityProviderState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AccessIdentityProviderState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["configs"] = state ? state.configs : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AccessIdentityProviderArgs | undefined;
            if (!args || args.accountId === undefined) {
                throw new Error("Missing required property 'accountId'");
            }
            if (!args || args.name === undefined) {
                throw new Error("Missing required property 'name'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["configs"] = args ? args.configs : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["type"] = args ? args.type : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AccessIdentityProvider.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessIdentityProvider resources.
 */
export interface AccessIdentityProviderState {
    readonly accountId?: pulumi.Input<string>;
    /**
     * Provider configuration from the [developer documentation][accessIdentityProviderGuide].
     */
    readonly configs?: pulumi.Input<pulumi.Input<inputs.AccessIdentityProviderConfig>[]>;
    /**
     * Friendly name of the Access Identity Provider configuration.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The provider type to use. Must be one of: `"centrify"`,
     * `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
     * `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessIdentityProvider resource.
 */
export interface AccessIdentityProviderArgs {
    readonly accountId: pulumi.Input<string>;
    /**
     * Provider configuration from the [developer documentation][accessIdentityProviderGuide].
     */
    readonly configs?: pulumi.Input<pulumi.Input<inputs.AccessIdentityProviderConfig>[]>;
    /**
     * Friendly name of the Access Identity Provider configuration.
     */
    readonly name: pulumi.Input<string>;
    /**
     * The provider type to use. Must be one of: `"centrify"`,
     * `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
     * `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
     */
    readonly type: pulumi.Input<string>;
}