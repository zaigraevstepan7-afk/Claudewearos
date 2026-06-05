package md;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f11632a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f11633b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f11634c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f11635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11636e;

    public l(int i10, int i11, Bundle bundle, int i12) {
        this.f11636e = i12;
        this.f11632a = i10;
        this.f11634c = i11;
        this.f11635d = bundle;
    }

    public final boolean a() {
        switch (this.f11636e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(a5.a aVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + aVar.toString());
        }
        this.f11633b.setException(aVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f11633b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f11634c + " id=" + this.f11632a + " oneWay=" + a() + "}";
    }
}
