package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e5.a;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final a f887a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.f887a;
    }
}
