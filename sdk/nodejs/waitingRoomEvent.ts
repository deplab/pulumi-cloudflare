// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Waiting Room Event resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Waiting Room Event
 * const example = new cloudflare.WaitingRoomEvent("example", {
 *     eventEndTime: "2006-01-02T20:04:05Z",
 *     eventStartTime: "2006-01-02T15:04:05Z",
 *     name: "foo",
 *     waitingRoomId: "d41d8cd98f00b204e9800998ecf8427e",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * Use the Zone ID, Waiting Room ID, and Event ID to import.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/waitingRoomEvent:WaitingRoomEvent default <zone_id>/<waiting_room_id>/<waiting_room_event_id>
 * ```
 */
export class WaitingRoomEvent extends pulumi.CustomResource {
    /**
     * Get an existing WaitingRoomEvent resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WaitingRoomEventState, opts?: pulumi.CustomResourceOptions): WaitingRoomEvent {
        return new WaitingRoomEvent(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/waitingRoomEvent:WaitingRoomEvent';

    /**
     * Returns true if the given object is an instance of WaitingRoomEvent.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WaitingRoomEvent {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WaitingRoomEvent.__pulumiType;
    }

    /**
     * Creation time.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * This is a templated html file that will be rendered at the edge.
     */
    public readonly customPageHtml!: pulumi.Output<string | undefined>;
    /**
     * A description to let users add more details about the event.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Disables automatic renewal of session cookies.
     */
    public readonly disableSessionRenewal!: pulumi.Output<boolean | undefined>;
    /**
     * ISO 8601 timestamp that marks the end of the event.
     */
    public readonly eventEndTime!: pulumi.Output<string>;
    /**
     * ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`.
     */
    public readonly eventStartTime!: pulumi.Output<string>;
    /**
     * Last modified time.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of new users that will be let into the route every minute.
     */
    public readonly newUsersPerMinute!: pulumi.Output<number | undefined>;
    /**
     * ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
     */
    public readonly prequeueStartTime!: pulumi.Output<string | undefined>;
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
     */
    public readonly queueingMethod!: pulumi.Output<string | undefined>;
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
     */
    public readonly sessionDuration!: pulumi.Output<number | undefined>;
    /**
     * Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
     */
    public readonly shuffleAtEventStart!: pulumi.Output<boolean | undefined>;
    /**
     * If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
     */
    public readonly suspended!: pulumi.Output<boolean | undefined>;
    /**
     * The total number of active user sessions on the route at a point in time.
     */
    public readonly totalActiveUsers!: pulumi.Output<number | undefined>;
    /**
     * The Waiting Room ID the event should apply to.
     */
    public readonly waitingRoomId!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WaitingRoomEvent resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WaitingRoomEventArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WaitingRoomEventArgs | WaitingRoomEventState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WaitingRoomEventState | undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["customPageHtml"] = state ? state.customPageHtml : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disableSessionRenewal"] = state ? state.disableSessionRenewal : undefined;
            resourceInputs["eventEndTime"] = state ? state.eventEndTime : undefined;
            resourceInputs["eventStartTime"] = state ? state.eventStartTime : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["newUsersPerMinute"] = state ? state.newUsersPerMinute : undefined;
            resourceInputs["prequeueStartTime"] = state ? state.prequeueStartTime : undefined;
            resourceInputs["queueingMethod"] = state ? state.queueingMethod : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            resourceInputs["shuffleAtEventStart"] = state ? state.shuffleAtEventStart : undefined;
            resourceInputs["suspended"] = state ? state.suspended : undefined;
            resourceInputs["totalActiveUsers"] = state ? state.totalActiveUsers : undefined;
            resourceInputs["waitingRoomId"] = state ? state.waitingRoomId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WaitingRoomEventArgs | undefined;
            if ((!args || args.eventEndTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventEndTime'");
            }
            if ((!args || args.eventStartTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventStartTime'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.waitingRoomId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'waitingRoomId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["customPageHtml"] = args ? args.customPageHtml : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disableSessionRenewal"] = args ? args.disableSessionRenewal : undefined;
            resourceInputs["eventEndTime"] = args ? args.eventEndTime : undefined;
            resourceInputs["eventStartTime"] = args ? args.eventStartTime : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["newUsersPerMinute"] = args ? args.newUsersPerMinute : undefined;
            resourceInputs["prequeueStartTime"] = args ? args.prequeueStartTime : undefined;
            resourceInputs["queueingMethod"] = args ? args.queueingMethod : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["shuffleAtEventStart"] = args ? args.shuffleAtEventStart : undefined;
            resourceInputs["suspended"] = args ? args.suspended : undefined;
            resourceInputs["totalActiveUsers"] = args ? args.totalActiveUsers : undefined;
            resourceInputs["waitingRoomId"] = args ? args.waitingRoomId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WaitingRoomEvent.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WaitingRoomEvent resources.
 */
export interface WaitingRoomEventState {
    /**
     * Creation time.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * This is a templated html file that will be rendered at the edge.
     */
    customPageHtml?: pulumi.Input<string>;
    /**
     * A description to let users add more details about the event.
     */
    description?: pulumi.Input<string>;
    /**
     * Disables automatic renewal of session cookies.
     */
    disableSessionRenewal?: pulumi.Input<boolean>;
    /**
     * ISO 8601 timestamp that marks the end of the event.
     */
    eventEndTime?: pulumi.Input<string>;
    /**
     * ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`.
     */
    eventStartTime?: pulumi.Input<string>;
    /**
     * Last modified time.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of new users that will be let into the route every minute.
     */
    newUsersPerMinute?: pulumi.Input<number>;
    /**
     * ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
     */
    prequeueStartTime?: pulumi.Input<string>;
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
     */
    queueingMethod?: pulumi.Input<string>;
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
     */
    sessionDuration?: pulumi.Input<number>;
    /**
     * Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
     */
    shuffleAtEventStart?: pulumi.Input<boolean>;
    /**
     * If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The total number of active user sessions on the route at a point in time.
     */
    totalActiveUsers?: pulumi.Input<number>;
    /**
     * The Waiting Room ID the event should apply to.
     */
    waitingRoomId?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WaitingRoomEvent resource.
 */
export interface WaitingRoomEventArgs {
    /**
     * This is a templated html file that will be rendered at the edge.
     */
    customPageHtml?: pulumi.Input<string>;
    /**
     * A description to let users add more details about the event.
     */
    description?: pulumi.Input<string>;
    /**
     * Disables automatic renewal of session cookies.
     */
    disableSessionRenewal?: pulumi.Input<boolean>;
    /**
     * ISO 8601 timestamp that marks the end of the event.
     */
    eventEndTime: pulumi.Input<string>;
    /**
     * ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`.
     */
    eventStartTime: pulumi.Input<string>;
    /**
     * A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed.
     */
    name: pulumi.Input<string>;
    /**
     * The number of new users that will be let into the route every minute.
     */
    newUsersPerMinute?: pulumi.Input<number>;
    /**
     * ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
     */
    prequeueStartTime?: pulumi.Input<string>;
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
     */
    queueingMethod?: pulumi.Input<string>;
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
     */
    sessionDuration?: pulumi.Input<number>;
    /**
     * Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
     */
    shuffleAtEventStart?: pulumi.Input<boolean>;
    /**
     * If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The total number of active user sessions on the route at a point in time.
     */
    totalActiveUsers?: pulumi.Input<number>;
    /**
     * The Waiting Room ID the event should apply to.
     */
    waitingRoomId: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
