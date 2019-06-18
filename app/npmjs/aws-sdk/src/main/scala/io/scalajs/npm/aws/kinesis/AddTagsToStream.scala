package io.scalajs.npm.aws.kinesis

import scala.scalajs.js

/**
  * Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify up
  * to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times. In
  * total, each stream can have up to 50 tags.
  *
  * If tags have already been assigned to the stream, AddTagsToStream overwrites any existing tags that correspond to
  * the specified tag keys.
  *
  * AddTagsToStream has a limit of five transactions per second per account.
  * @param StreamName The name of the stream.
  * @param Tags       A set of up to 10 key-value pairs to use to create the tags.
  */
class AddTagsToStream(var StreamName: js.UndefOr[String] = js.undefined,
                      var Tags: js.UndefOr[js.Dictionary[String]] = js.undefined) extends js.Object