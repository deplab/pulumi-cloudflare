// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Waiting Room resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Waiting Room
 * const example = new cloudflare.WaitingRoom("example", {
 *     host: "foo.example.com",
 *     name: "foo",
 *     newUsersPerMinute: 200,
 *     path: "/",
 *     totalActiveUsers: 200,
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * Use the Zone ID and Waiting Room ID to import.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/waitingRoom:WaitingRoom default <zone_id>/<waiting_room_id>
 * ```
 */
export class WaitingRoom extends pulumi.CustomResource {
    /**
     * Get an existing WaitingRoom resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WaitingRoomState, opts?: pulumi.CustomResourceOptions): WaitingRoom {
        return new WaitingRoom(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/waitingRoom:WaitingRoom';

    /**
     * Returns true if the given object is an instance of WaitingRoom.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WaitingRoom {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WaitingRoom.__pulumiType;
    }

    /**
     * This is a templated html file that will be rendered at the edge.
     */
    public readonly customPageHtml!: pulumi.Output<string | undefined>;
    /**
     * The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`. Defaults to `en-US`.
     */
    public readonly defaultTemplateLanguage!: pulumi.Output<string | undefined>;
    /**
     * A description to add more details about the waiting room.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Disables automatic renewal of session cookies.
     */
    public readonly disableSessionRenewal!: pulumi.Output<boolean | undefined>;
    /**
     * Host name for which the waiting room will be applied (no wildcards).
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     */
    public readonly jsonResponseEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * A unique name to identify the waiting room.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of new users that will be let into the route every minute.
     */
    public readonly newUsersPerMinute!: pulumi.Output<number>;
    /**
     * The path within the host to enable the waiting room on. Defaults to `/`.
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * If queueAll is true, then all traffic will be sent to the waiting room.
     */
    public readonly queueAll!: pulumi.Output<boolean | undefined>;
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     */
    public readonly queueingMethod!: pulumi.Output<string | undefined>;
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     */
    public readonly sessionDuration!: pulumi.Output<number | undefined>;
    /**
     * Suspends the waiting room.
     */
    public readonly suspended!: pulumi.Output<boolean | undefined>;
    /**
     * The total number of active user sessions on the route at a point in time.
     */
    public readonly totalActiveUsers!: pulumi.Output<number>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WaitingRoom resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WaitingRoomArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WaitingRoomArgs | WaitingRoomState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WaitingRoomState | undefined;
            resourceInputs["customPageHtml"] = state ? state.customPageHtml : undefined;
            resourceInputs["defaultTemplateLanguage"] = state ? state.defaultTemplateLanguage : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disableSessionRenewal"] = state ? state.disableSessionRenewal : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["jsonResponseEnabled"] = state ? state.jsonResponseEnabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["newUsersPerMinute"] = state ? state.newUsersPerMinute : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["queueAll"] = state ? state.queueAll : undefined;
            resourceInputs["queueingMethod"] = state ? state.queueingMethod : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            resourceInputs["suspended"] = state ? state.suspended : undefined;
            resourceInputs["totalActiveUsers"] = state ? state.totalActiveUsers : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WaitingRoomArgs | undefined;
            if ((!args || args.host === undefined) && !opts.urn) {
                throw new Error("Missing required property 'host'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.newUsersPerMinute === undefined) && !opts.urn) {
                throw new Error("Missing required property 'newUsersPerMinute'");
            }
            if ((!args || args.totalActiveUsers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'totalActiveUsers'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["customPageHtml"] = args ? args.customPageHtml : undefined;
            resourceInputs["defaultTemplateLanguage"] = args ? args.defaultTemplateLanguage : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disableSessionRenewal"] = args ? args.disableSessionRenewal : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["jsonResponseEnabled"] = args ? args.jsonResponseEnabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["newUsersPerMinute"] = args ? args.newUsersPerMinute : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["queueAll"] = args ? args.queueAll : undefined;
            resourceInputs["queueingMethod"] = args ? args.queueingMethod : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["suspended"] = args ? args.suspended : undefined;
            resourceInputs["totalActiveUsers"] = args ? args.totalActiveUsers : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WaitingRoom.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WaitingRoom resources.
 */
export interface WaitingRoomState {
    /**
     * This is a templated html file that will be rendered at the edge.
     */
    customPageHtml?: pulumi.Input<string>;
    /**
     * The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`. Defaults to `en-US`.
     */
    defaultTemplateLanguage?: pulumi.Input<string>;
    /**
     * A description to add more details about the waiting room.
     */
    description?: pulumi.Input<string>;
    /**
     * Disables automatic renewal of session cookies.
     */
    disableSessionRenewal?: pulumi.Input<boolean>;
    /**
     * Host name for which the waiting room will be applied (no wildcards).
     */
    host?: pulumi.Input<string>;
    /**
     * If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     */
    jsonResponseEnabled?: pulumi.Input<boolean>;
    /**
     * A unique name to identify the waiting room.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of new users that will be let into the route every minute.
     */
    newUsersPerMinute?: pulumi.Input<number>;
    /**
     * The path within the host to enable the waiting room on. Defaults to `/`.
     */
    path?: pulumi.Input<string>;
    /**
     * If queueAll is true, then all traffic will be sent to the waiting room.
     */
    queueAll?: pulumi.Input<boolean>;
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     */
    queueingMethod?: pulumi.Input<string>;
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     */
    sessionDuration?: pulumi.Input<number>;
    /**
     * Suspends the waiting room.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The total number of active user sessions on the route at a point in time.
     */
    totalActiveUsers?: pulumi.Input<number>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WaitingRoom resource.
 */
export interface WaitingRoomArgs {
    /**
     * This is a templated html file that will be rendered at the edge.
     */
    customPageHtml?: pulumi.Input<string>;
    /**
     * The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`. Defaults to `en-US`.
     */
    defaultTemplateLanguage?: pulumi.Input<string>;
    /**
     * A description to add more details about the waiting room.
     */
    description?: pulumi.Input<string>;
    /**
     * Disables automatic renewal of session cookies.
     */
    disableSessionRenewal?: pulumi.Input<boolean>;
    /**
     * Host name for which the waiting room will be applied (no wildcards).
     */
    host: pulumi.Input<string>;
    /**
     * If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     */
    jsonResponseEnabled?: pulumi.Input<boolean>;
    /**
     * A unique name to identify the waiting room.
     */
    name: pulumi.Input<string>;
    /**
     * The number of new users that will be let into the route every minute.
     */
    newUsersPerMinute: pulumi.Input<number>;
    /**
     * The path within the host to enable the waiting room on. Defaults to `/`.
     */
    path?: pulumi.Input<string>;
    /**
     * If queueAll is true, then all traffic will be sent to the waiting room.
     */
    queueAll?: pulumi.Input<boolean>;
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     */
    queueingMethod?: pulumi.Input<string>;
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     */
    sessionDuration?: pulumi.Input<number>;
    /**
     * Suspends the waiting room.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The total number of active user sessions on the route at a point in time.
     */
    totalActiveUsers: pulumi.Input<number>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
