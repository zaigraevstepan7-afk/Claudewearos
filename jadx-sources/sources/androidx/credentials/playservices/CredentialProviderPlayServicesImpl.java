package androidx.credentials.playservices;

import a2.d0;
import a2.f0;
import ac.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.OnFailureListener;
import e5.c;
import fj.l;
import hd.f;
import hd.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import nd.b;
import z4.a;
import z4.d;
import z4.e;
import z4.j;
import z4.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements e {
    public static final c Companion = new c();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private nd.e googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        l.f(context, "context");
        this.context = context;
        this.googleApiAvailability = nd.e.f12278d;
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.d(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(ej.c cVar, Object obj) {
        l.f(cVar, "$tmp0");
        cVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, d dVar, Exception exc) {
        l.f(credentialProviderPlayServicesImpl, "this$0");
        l.f(executor, "$executor");
        l.f(dVar, "$callback");
        l.f(exc, "e");
        c cVar = Companion;
        e5.e eVar = new e5.e(exc, executor, dVar, 0);
        cVar.getClass();
        if (c.a(cancellationSignal)) {
            return;
        }
        eVar.a();
    }

    public final nd.e getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // z4.e
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z2 = iIsGooglePlayServicesAvailable == 0;
        if (!z2) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new b(iIsGooglePlayServicesAvailable));
        }
        return z2;
    }

    public void onClearCredential(a aVar, final CancellationSignal cancellationSignal, final Executor executor, final d dVar) {
        l.f(aVar, "request");
        l.f(executor, "executor");
        l.f(dVar, "callback");
        Companion.getClass();
        if (c.a(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        e0.i(context);
        new zbaq(context, new s()).signOut().addOnSuccessListener(new h(new e5.d(cancellationSignal, executor, dVar), 6)).addOnFailureListener(new OnFailureListener() { // from class: e5.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f5785a, cancellationSignal, executor, dVar, exc);
            }
        });
    }

    public void onCreateCredential(Context context, z4.b bVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        l.f(context, "context");
        l.f(bVar, "request");
        throw null;
    }

    public void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        l.f(context, "context");
        l.f(mVar, "pendingGetCredentialHandle");
        l.f(executor, "executor");
        l.f(dVar, "callback");
    }

    public void onPrepareCredential(j jVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        l.f(jVar, "request");
        l.f(executor, "executor");
        l.f(dVar, "callback");
    }

    public final void setGoogleApiAvailability(nd.e eVar) {
        l.f(eVar, "<set-?>");
        this.googleApiAvailability = eVar;
    }

    @Override // z4.e
    public void onGetCredential(Context context, j jVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        l.f(context, "context");
        l.f(jVar, "request");
        List<le.a> list = jVar.f20377a;
        l.f(executor, "executor");
        l.f(dVar, "callback");
        Companion.getClass();
        if (c.a(cancellationSignal)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((le.a) it.next()) instanceof le.a) {
                i5.c cVar = new i5.c(context);
                cVar.f8352g = cancellationSignal;
                cVar.f8350e = dVar;
                cVar.f8351f = executor;
                Companion.getClass();
                if (c.a(cancellationSignal)) {
                    return;
                }
                try {
                    hd.j jVarD = i5.c.d(jVar);
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    intent.putExtra("REQUEST_TYPE", jVarD);
                    f5.a.b(cVar.f8353h, intent, "SIGN_IN_INTENT");
                    context.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    if (!(e10 instanceof a5.e)) {
                        f5.a.a(cancellationSignal, new f0(cVar, 4));
                        return;
                    } else {
                        f5.a.a(cancellationSignal, new d0(12, cVar, (a5.e) e10));
                        return;
                    }
                }
            }
        }
        g5.d dVar2 = new g5.d(context);
        dVar2.f7211g = cancellationSignal;
        dVar2.f7209e = dVar;
        dVar2.f7210f = executor;
        Companion.getClass();
        if (c.a(cancellationSignal)) {
            return;
        }
        hd.e eVar = new hd.e(false);
        hd.b bVar = new hd.b(false, null, null, true, null, null, false);
        hd.d dVar3 = new hd.d(null, null, false);
        hd.c cVar2 = new hd.c(null, false);
        PackageManager packageManager = context.getPackageManager();
        l.e(packageManager, "context.packageManager");
        int i10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        for (le.a aVar : list) {
        }
        f fVar = new f(eVar, bVar, null, false, 0, dVar3, cVar2, false);
        Intent intent2 = new Intent(context, (Class<?>) HiddenActivity.class);
        intent2.putExtra("REQUEST_TYPE", fVar);
        f5.a.b(dVar2.f7212h, intent2, "BEGIN_SIGN_IN");
        try {
            context.startActivity(intent2);
        } catch (Exception unused) {
            f5.a.a(cancellationSignal, new f0(dVar2, 2));
        }
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
