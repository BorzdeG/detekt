package io.gitlab.arturbosch.detekt.formatting.wrappers

import com.pinterest.ktlint.ruleset.standard.SpacingAroundParensRule
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.internal.ActiveByDefault
import io.gitlab.arturbosch.detekt.formatting.FormattingRule

/**
 * See <a href="https://ktlint.github.io/#rule-spacing">ktlint-website</a> for documentation.
 *
 * @autoCorrect since v1.0.0
 */
@ActiveByDefault(since = "1.0.0")
class SpacingAroundParens(config: Config) : FormattingRule(config) {

    override val wrapping = SpacingAroundParensRule()
    override val issue = issueFor("Reports spaces around parentheses")
}
