// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.
 *
 * **This resource requires you use your Origin CA Key as the `apiUserServiceKey`.**
 *
 */
export class OriginCaCertificate extends pulumi.CustomResource {
    /**
     * Get an existing OriginCaCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OriginCaCertificateState, opts?: pulumi.CustomResourceOptions): OriginCaCertificate {
        return new OriginCaCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/originCaCertificate:OriginCaCertificate';

    /**
     * Returns true if the given object is an instance of OriginCaCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OriginCaCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OriginCaCertificate.__pulumiType;
    }

    /**
     * The Origin CA certificate
     */
    public /*out*/ readonly certificate!: pulumi.Output<string>;
    /**
     * The Certificate Signing Request. Must be newline-encoded.
     */
    public readonly csr!: pulumi.Output<string>;
    /**
     * The datetime when the certificate will expire.
     */
    public /*out*/ readonly expiresOn!: pulumi.Output<string>;
    /**
     * An array of hostnames or wildcard names bound to the certificate.
     */
    public readonly hostnames!: pulumi.Output<string[]>;
    /**
     * The signature type desired on the certificate.
     */
    public readonly requestType!: pulumi.Output<string>;
    /**
     * The number of days for which the certificate should be valid.
     */
    public readonly requestedValidity!: pulumi.Output<number | undefined>;

    /**
     * Create a OriginCaCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OriginCaCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OriginCaCertificateArgs | OriginCaCertificateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as OriginCaCertificateState | undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["csr"] = state ? state.csr : undefined;
            inputs["expiresOn"] = state ? state.expiresOn : undefined;
            inputs["hostnames"] = state ? state.hostnames : undefined;
            inputs["requestType"] = state ? state.requestType : undefined;
            inputs["requestedValidity"] = state ? state.requestedValidity : undefined;
        } else {
            const args = argsOrState as OriginCaCertificateArgs | undefined;
            if (!args || args.csr === undefined) {
                throw new Error("Missing required property 'csr'");
            }
            if (!args || args.hostnames === undefined) {
                throw new Error("Missing required property 'hostnames'");
            }
            if (!args || args.requestType === undefined) {
                throw new Error("Missing required property 'requestType'");
            }
            inputs["csr"] = args ? args.csr : undefined;
            inputs["hostnames"] = args ? args.hostnames : undefined;
            inputs["requestType"] = args ? args.requestType : undefined;
            inputs["requestedValidity"] = args ? args.requestedValidity : undefined;
            inputs["certificate"] = undefined /*out*/;
            inputs["expiresOn"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(OriginCaCertificate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OriginCaCertificate resources.
 */
export interface OriginCaCertificateState {
    /**
     * The Origin CA certificate
     */
    readonly certificate?: pulumi.Input<string>;
    /**
     * The Certificate Signing Request. Must be newline-encoded.
     */
    readonly csr?: pulumi.Input<string>;
    /**
     * The datetime when the certificate will expire.
     */
    readonly expiresOn?: pulumi.Input<string>;
    /**
     * An array of hostnames or wildcard names bound to the certificate.
     */
    readonly hostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The signature type desired on the certificate.
     */
    readonly requestType?: pulumi.Input<string>;
    /**
     * The number of days for which the certificate should be valid.
     */
    readonly requestedValidity?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a OriginCaCertificate resource.
 */
export interface OriginCaCertificateArgs {
    /**
     * The Certificate Signing Request. Must be newline-encoded.
     */
    readonly csr: pulumi.Input<string>;
    /**
     * An array of hostnames or wildcard names bound to the certificate.
     */
    readonly hostnames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The signature type desired on the certificate.
     */
    readonly requestType: pulumi.Input<string>;
    /**
     * The number of days for which the certificate should be valid.
     */
    readonly requestedValidity?: pulumi.Input<number>;
}
