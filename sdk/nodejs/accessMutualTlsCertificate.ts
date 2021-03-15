// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Mutual TLS Certificate resource. Mutual TLS authentication ensures that the traffic is secure and trusted in both directions between a client and server and can be used with Access to only allows requests from devices with a corresponding client certificate.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const myCert = new cloudflare.AccessMutualTlsCertificate("myCert", {
 *     zoneId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     name: "My Root Cert",
 *     certificate: _var.ca_pem,
 *     associatedHostnames: ["staging.example.com"],
 * });
 * ```
 *
 * ## Import
 *
 * Access Mutual TLS Certificate can be imported using a composite ID composed of the account or zone and the mutual TLS certificate ID in the form of`account/ACCOUNT_ID/MUTUAL_TLS_CERTIFICATE_ID` or `zone/ZONE_ID/MUTUAL_TLS_CERTIFICATE_ID`.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate staging account/cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
 * ```
 */
export class AccessMutualTlsCertificate extends pulumi.CustomResource {
    /**
     * Get an existing AccessMutualTlsCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessMutualTlsCertificateState, opts?: pulumi.CustomResourceOptions): AccessMutualTlsCertificate {
        return new AccessMutualTlsCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate';

    /**
     * Returns true if the given object is an instance of AccessMutualTlsCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessMutualTlsCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessMutualTlsCertificate.__pulumiType;
    }

    /**
     * The account to which the certificate should be added. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The hostnames that will be prompted for this certificate.
     */
    public readonly associatedHostnames!: pulumi.Output<string[] | undefined>;
    /**
     * The Root CA for your certificates.
     */
    public readonly certificate!: pulumi.Output<string | undefined>;
    public /*out*/ readonly fingerprint!: pulumi.Output<string>;
    /**
     * The name of the certificate.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The DNS zone to which the certificate should be added. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessMutualTlsCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessMutualTlsCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessMutualTlsCertificateArgs | AccessMutualTlsCertificateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessMutualTlsCertificateState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["associatedHostnames"] = state ? state.associatedHostnames : undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["fingerprint"] = state ? state.fingerprint : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessMutualTlsCertificateArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["associatedHostnames"] = args ? args.associatedHostnames : undefined;
            inputs["certificate"] = args ? args.certificate : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["fingerprint"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AccessMutualTlsCertificate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessMutualTlsCertificate resources.
 */
export interface AccessMutualTlsCertificateState {
    /**
     * The account to which the certificate should be added. Conflicts with `zoneId`.
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * The hostnames that will be prompted for this certificate.
     */
    readonly associatedHostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Root CA for your certificates.
     */
    readonly certificate?: pulumi.Input<string>;
    readonly fingerprint?: pulumi.Input<string>;
    /**
     * The name of the certificate.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The DNS zone to which the certificate should be added. Conflicts with `accountId`.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessMutualTlsCertificate resource.
 */
export interface AccessMutualTlsCertificateArgs {
    /**
     * The account to which the certificate should be added. Conflicts with `zoneId`.
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * The hostnames that will be prompted for this certificate.
     */
    readonly associatedHostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Root CA for your certificates.
     */
    readonly certificate?: pulumi.Input<string>;
    /**
     * The name of the certificate.
     */
    readonly name: pulumi.Input<string>;
    /**
     * The DNS zone to which the certificate should be added. Conflicts with `accountId`.
     */
    readonly zoneId?: pulumi.Input<string>;
}
