package b8;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.material.datepicker.m;
import java.util.ArrayList;
import java.util.List;
import ld.i;
import t6.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1632b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1633c;

    public /* synthetic */ f(int i10, int i11, Object obj) {
        this.f1631a = i11;
        this.f1633c = obj;
        this.f1632b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1631a) {
            case 0:
                ((SystemForegroundService) this.f1633c).f1257e.cancel(this.f1632b);
                break;
            case 1:
                ((g0) this.f1633c).f(this.f1632b);
                break;
            case 2:
                RecyclerView recyclerView = ((m) this.f1633c).f3872v0;
                if (!recyclerView.O) {
                    e0 e0Var = recyclerView.E;
                    if (e0Var != null) {
                        e0Var.y0(recyclerView, this.f1632b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
            case 3:
                k4.b bVar = (k4.b) ((i) this.f1633c).f10924b;
                if (bVar != null) {
                    bVar.g(this.f1632b);
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f1633c;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f1632b == 1) {
                    while (i10 < size) {
                        ((r5.i) arrayList.get(i10)).b();
                        i10++;
                    }
                    break;
                } else {
                    while (i10 < size) {
                        ((r5.i) arrayList.get(i10)).a();
                        i10++;
                    }
                    break;
                }
        }
    }

    public f(List list, int i10, Throwable th2) {
        this.f1631a = 4;
        uk.c.p(list, "initCallbacks cannot be null");
        this.f1633c = new ArrayList(list);
        this.f1632b = i10;
    }
}
