package rawhttp.core.client;

import java.io.IOException;
import rawhttp.core.RawHttpRequest;
import rawhttp.core.RawHttpResponse;

/**
 * Definition of a simple HTTP client that can send out Raw HTTP requests.
 * <p>
 * Having a generic type allows implementations of this interface to expose a type-safe HTTP response
 * representing the library's own implementation of HTTP Responses,
 * alongside Raw HTTP's own {@link RawHttpResponse}.
 *
 * @param <Response> library-specific HTTP response
 */
public interface RawHttpClient<Response> {

    /**
     * Send the given HTTP request.
     *
     * @param request HTTP request
     * @return HTTP response
     * @throws IOException in case an error occurs while transmitting the message
     */
    RawHttpResponse<Response> send(RawHttpRequest request) throws IOException;

}
