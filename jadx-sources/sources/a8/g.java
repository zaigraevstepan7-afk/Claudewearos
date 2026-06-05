package a8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f209a;

    public g(h hVar) {
        this.f209a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        m.g().c(h.f210i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
        h hVar = this.f209a;
        hVar.c(hVar.f());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        m.g().c(h.f210i, "Network connection lost", new Throwable[0]);
        h hVar = this.f209a;
        hVar.c(hVar.f());
    }
}
