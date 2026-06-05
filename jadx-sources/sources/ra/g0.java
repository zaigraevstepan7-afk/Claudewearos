package ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lb.g f14003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f14005c;

    public g0(Context context, f1.a1 a1Var, lb.g gVar) {
        this.f14003a = gVar;
        this.f14004b = context;
        this.f14005c = a1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fj.l.f(context, "ctx");
        fj.l.f(intent, "intent");
        String stringExtra = intent.getStringExtra("uri");
        if (stringExtra == null) {
            return;
        }
        Uri uri = Uri.parse(stringExtra);
        try {
            this.f14004b.getContentResolver().takePersistableUriPermission(uri, 1);
        } catch (Throwable th2) {
            uk.c.r(th2);
        }
        this.f14003a.C(uri);
        this.f14005c.setValue(uri);
    }
}
