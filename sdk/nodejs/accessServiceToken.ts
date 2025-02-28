// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Access Service Tokens are used for service-to-service communication
 * when an application is behind Cloudflare Access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Generate a service token that will renew if terraform is ran within 30 days of expiration
 * const myApp = new cloudflare.AccessServiceToken("myApp", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     minDaysForRenewal: 30,
 *     name: "CI/CD app renewed",
 * });
 * ```
 *
 * ## Import
 *
 * If you are importing an Access Service Token you will not have the client_secret available in the state for use. The client_secret is only available once, at creation. In most cases, it is better to just create a new resource should you need to reference it in other resources.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example <account_id>/<service_token_id>
 * ```
 */
export class AccessServiceToken extends pulumi.CustomResource {
    /**
     * Get an existing AccessServiceToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessServiceTokenState, opts?: pulumi.CustomResourceOptions): AccessServiceToken {
        return new AccessServiceToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessServiceToken:AccessServiceToken';

    /**
     * Returns true if the given object is an instance of AccessServiceToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessServiceToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessServiceToken.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * UUID client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
     */
    public /*out*/ readonly clientId!: pulumi.Output<string>;
    /**
     * A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
     */
    public /*out*/ readonly clientSecret!: pulumi.Output<string>;
    /**
     * Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
     */
    public readonly duration!: pulumi.Output<string>;
    /**
     * Date when the token expires.
     */
    public /*out*/ readonly expiresAt!: pulumi.Output<string>;
    /**
     * Refresh the token if terraform is run within the specified amount of days before expiration
     */
    public readonly minDaysForRenewal!: pulumi.Output<number | undefined>;
    /**
     * Friendly name of the token's intent.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a AccessServiceToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessServiceTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessServiceTokenArgs | AccessServiceTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessServiceTokenState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["expiresAt"] = state ? state.expiresAt : undefined;
            resourceInputs["minDaysForRenewal"] = state ? state.minDaysForRenewal : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessServiceTokenArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["minDaysForRenewal"] = args ? args.minDaysForRenewal : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["clientId"] = undefined /*out*/;
            resourceInputs["clientSecret"] = undefined /*out*/;
            resourceInputs["expiresAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["clientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AccessServiceToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessServiceToken resources.
 */
export interface AccessServiceTokenState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * UUID client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
     */
    clientId?: pulumi.Input<string>;
    /**
     * A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
     */
    duration?: pulumi.Input<string>;
    /**
     * Date when the token expires.
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * Refresh the token if terraform is run within the specified amount of days before expiration
     */
    minDaysForRenewal?: pulumi.Input<number>;
    /**
     * Friendly name of the token's intent.
     */
    name?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessServiceToken resource.
 */
export interface AccessServiceTokenArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
     */
    duration?: pulumi.Input<string>;
    /**
     * Refresh the token if terraform is run within the specified amount of days before expiration
     */
    minDaysForRenewal?: pulumi.Input<number>;
    /**
     * Friendly name of the token's intent.
     */
    name: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
