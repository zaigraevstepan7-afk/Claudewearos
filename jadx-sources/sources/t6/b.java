package t6;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f15831c;

    public /* synthetic */ b(h hVar, ArrayList arrayList, int i10) {
        this.f15829a = i10;
        this.f15831c = hVar;
        this.f15830b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15829a) {
            case 0:
                ArrayList arrayList = this.f15830b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    h hVar = this.f15831c;
                    if (i10 >= size) {
                        arrayList.clear();
                        hVar.f15908m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = (g) obj;
                        t0 t0Var = gVar.f15897a;
                        int i11 = gVar.f15898b;
                        int i12 = gVar.f15899c;
                        int i13 = gVar.f15900d;
                        int i14 = gVar.f15901e;
                        hVar.getClass();
                        View view = t0Var.f16046a;
                        int i15 = i13 - i11;
                        int i16 = i14 - i12;
                        if (i15 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i16 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        hVar.f15911p.add(t0Var);
                        viewPropertyAnimatorAnimate.setDuration(hVar.f15836e).setListener(new d(hVar, t0Var, i15, view, i16, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f15830b;
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    h hVar2 = this.f15831c;
                    if (i17 >= size2) {
                        arrayList2.clear();
                        hVar2.f15909n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i17);
                        i17++;
                        f fVar = (f) obj2;
                        ArrayList arrayList3 = hVar2.f15913r;
                        long j = hVar2.f15837f;
                        t0 t0Var2 = fVar.f15887a;
                        View view2 = t0Var2 == null ? null : t0Var2.f16046a;
                        t0 t0Var3 = fVar.f15888b;
                        View view3 = t0Var3 != null ? t0Var3.f16046a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(fVar.f15887a);
                            duration.translationX(fVar.f15891e - fVar.f15889c);
                            duration.translationY(fVar.f15892f - fVar.f15890d);
                            duration.alpha(0.0f).setListener(new e(hVar2, fVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(fVar.f15888b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new e(hVar2, fVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f15830b;
                int size3 = arrayList4.size();
                int i18 = 0;
                while (true) {
                    h hVar3 = this.f15831c;
                    if (i18 >= size3) {
                        arrayList4.clear();
                        hVar3.f15907l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i18);
                        i18++;
                        t0 t0Var4 = (t0) obj3;
                        hVar3.getClass();
                        View view4 = t0Var4.f16046a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        hVar3.f15910o.add(t0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(hVar3.f15834c).setListener(new c(hVar3, t0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
