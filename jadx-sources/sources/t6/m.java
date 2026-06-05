package t6;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f15961e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final ea.e f15962f = new ea.e(12);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f15963a;

    /* renamed from: b, reason: collision with root package name */
    public long f15964b;

    /* renamed from: c, reason: collision with root package name */
    public long f15965c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f15966d;

    public static t0 c(RecyclerView recyclerView, int i10, long j) {
        int iV = recyclerView.f1181e.v();
        for (int i11 = 0; i11 < iV; i11++) {
            t0 t0VarH = RecyclerView.H(recyclerView.f1181e.u(i11));
            if (t0VarH.f16048c == i10 && !t0VarH.f()) {
                return null;
            }
        }
        k0 k0Var = recyclerView.f1175b;
        try {
            recyclerView.O();
            t0 t0VarJ = k0Var.j(i10, j);
            if (t0VarJ != null) {
                if (!t0VarJ.e() || t0VarJ.f()) {
                    k0Var.a(t0VarJ, false);
                } else {
                    k0Var.g(t0VarJ.f16046a);
                }
            }
            recyclerView.P(false);
            return t0VarJ;
        } catch (Throwable th2) {
            recyclerView.P(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.J && this.f15964b == 0) {
            this.f15964b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.k kVar = recyclerView.f1200v0;
        kVar.f954b = i10;
        kVar.f955c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f15963a;
        try {
            int i10 = p4.g.f12796a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f15965c);
                }
            }
            this.f15964b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f15964b = 0L;
            int i12 = p4.g.f12796a;
            Trace.endSection();
            throw th2;
        }
    }
}
