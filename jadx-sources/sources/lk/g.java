package lk;

import fj.l;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends kk.e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f11016m;

    public g(Socket socket) {
        l.f(socket, "socket");
        this.f11016m = socket;
    }

    @Override // kk.e
    public final void j() throws IOException {
        Socket socket = this.f11016m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!k.a(e10)) {
                throw e10;
            }
            k.f11045a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            k.f11045a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
