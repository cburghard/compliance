package org.ga4gh.cts.api.rna;

import org.ga4gh.ctk.CtkLogs;
import org.ga4gh.ctk.transport.GAWrapperException;
import org.ga4gh.ctk.transport.URLMAPPING;
import org.ga4gh.ctk.transport.protocols.Client;
import org.ga4gh.cts.api.Utils;
import org.ga4gh.methods.SearchRnaQuantificationRequest;
import org.ga4gh.methods.SearchRnaQuantificationResponse;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verify basic operations on rnaquantification, expressionlevel, and featuregroup objects.
 */
@Category(RNATests.class)
public class RNAMethodsEndpointAliveIT implements CtkLogs {

    private static Client client = new Client(URLMAPPING.getInstance());

    /**
     * Show that a SearchRnaQuantificationRequest is accepted and returns a parseable Response.
     *
     * @throws Exception if something goes wrong
     */
    @Test
    public void testRnaQuantificationSearch() throws Exception {
        final SearchRnaQuantificationRequest request =
                SearchRnaQuantificationRequest.newBuilder()
                        .setRnaQuantificationId(Utils.randomId())
                        .build();

        final SearchRnaQuantificationResponse rtn = client.rnaquantification.searchRnaQuantification(request);
        assertThat(rtn.getRnaQuantification()).isNullOrEmpty();
    }
}
