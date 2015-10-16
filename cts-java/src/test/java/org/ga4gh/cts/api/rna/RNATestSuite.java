package org.ga4gh.cts.api.rna;

import com.googlecode.junittoolbox.IncludeCategories;
import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

/**
 * <p>This suite runs the "rna" category of tests.</p>
 * <p>Uses {@link WildcardPatternSuite} runner, so use junittoolbox's {@code @IncludeCategories}
 * or {@code ExcludeCategories} if you need to customize.</p>
 * <p>If there are no tests categorized as {@code RNATests} then you'll get
 * a {@code NoTestsRemainException}</p>
 *
 * Created by Christina Burghard on 10/5/2015.
 */
@RunWith(WildcardPatternSuite.class)
@IncludeCategories(RNATests.class)
@SuiteClasses({"**/*IT.class", "**/*Test.class"})
public class RNATestSuite {
}
