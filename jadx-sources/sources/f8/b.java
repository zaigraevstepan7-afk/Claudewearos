package f8;

import ac.d;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;
import lg.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6651a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6652b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f6651a = i10;
        this.f6652b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6651a) {
            case 0:
                ((Handler) ((d) this.f6652b).f374c).post(runnable);
                break;
            case 1:
                ((Executor) this.f6652b).execute(new j(1, runnable));
                break;
            default:
                ((zzi) this.f6652b).post(runnable);
                break;
        }
    }

    public b(Looper looper) {
        this.f6651a = 2;
        this.f6652b = new zzi(looper);
    }
}
