package hk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Method f8042c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f8043d;

    public i(Method method, Method method2) {
        this.f8042c = method;
        this.f8043d = method2;
    }

    @Override // hk.j
    public final void g(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListB = j.b(list);
            this.f8042c.invoke(sSLParameters, arrayListB.toArray(new String[arrayListB.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set SSL parameters", e10);
        }
    }

    @Override // hk.j
    public final String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f8043d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof UnsupportedOperationException)) {
                throw new AssertionError("failed to get ALPN selected protocol", e11);
            }
        }
        return null;
    }
}
