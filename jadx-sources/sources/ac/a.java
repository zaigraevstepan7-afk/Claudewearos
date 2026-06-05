package ac;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import q.b0;
import w2.f0;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f366a;

    public /* synthetic */ a(int i10) {
        this.f366a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f366a) {
            case 0:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f3435a;
                return;
            case 1:
                throw null;
            default:
                b0 b0Var = t.f18379j1;
                synchronized (b0Var) {
                    try {
                        int i11 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = b0Var.f13033a;
                            int i12 = b0Var.f13034b;
                            while (i11 < i12) {
                                t tVar = (t) objArr[i11];
                                boolean showLayoutBounds = tVar.getShowLayoutBounds();
                                Class cls = t.f18376g1;
                                tVar.setShowLayoutBounds(f0.m());
                                if (showLayoutBounds != tVar.getShowLayoutBounds()) {
                                    tVar.post(new w2.j(tVar, 2));
                                }
                                i11++;
                            }
                        } else {
                            Object[] objArr2 = b0Var.f13033a;
                            int i13 = b0Var.f13034b;
                            while (i11 < i13) {
                                t tVar2 = (t) objArr2[i11];
                                tVar2.post(new w2.j(tVar2, 3));
                                i11++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
