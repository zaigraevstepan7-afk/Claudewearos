package w5;

import android.view.View;
import java.util.ArrayList;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f18618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f18619c;

    public /* synthetic */ d(m mVar, s0 s0Var, int i10) {
        this.f18617a = i10;
        this.f18618b = mVar;
        this.f18619c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18617a) {
            case 0:
                m mVar = this.f18618b;
                fj.l.f(mVar, "this$0");
                s0 s0Var = this.f18619c;
                fj.l.f(s0Var, "$operation");
                mVar.a(s0Var);
                break;
            case 1:
                m mVar2 = this.f18618b;
                ArrayList arrayList = mVar2.f18683b;
                s0 s0Var2 = this.f18619c;
                if (arrayList.contains(s0Var2)) {
                    int i10 = s0Var2.f18741a;
                    View view = s0Var2.f18743c.Z;
                    fj.l.e(view, "operation.fragment.mView");
                    m1.a(i10, view, mVar2.f18682a);
                    break;
                }
                break;
            default:
                m mVar3 = this.f18618b;
                ArrayList arrayList2 = mVar3.f18683b;
                s0 s0Var3 = this.f18619c;
                arrayList2.remove(s0Var3);
                mVar3.f18684c.remove(s0Var3);
                break;
        }
    }
}
