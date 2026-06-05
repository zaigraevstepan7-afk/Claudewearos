package w4;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18568a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final g f18569b;

    /* renamed from: c, reason: collision with root package name */
    public l4.b f18570c;

    /* renamed from: d, reason: collision with root package name */
    public l4.b f18571d;

    /* renamed from: e, reason: collision with root package name */
    public int f18572e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18573f;

    public c(g gVar, ArrayList arrayList) {
        l4.b bVar = l4.b.f9966e;
        this.f18570c = bVar;
        this.f18571d = bVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f18582b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            l4.b bVar2 = gVar.f18583c;
            l4.b bVar3 = gVar.f18584d;
            this.f18570c = bVar2;
            this.f18571d = bVar3;
            c();
            b(gVar.f18585e);
        }
        this.f18569b = gVar;
    }

    public final void a(List list, boolean z2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) list.get(i10);
            aVar.getClass();
            if (true == z2) {
                c cVar = aVar.f18555e;
                if (cVar != null) {
                    throw new IllegalStateException(aVar + " is already controlled by " + cVar);
                }
                aVar.f18555e = this;
                this.f18568a.add(aVar);
            }
        }
    }

    public final void b(int i10) {
        ArrayList arrayList = this.f18568a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.f18557g) {
                ColorDrawable colorDrawable = aVar.f18556f;
                if (aVar.f18558h != i10) {
                    aVar.f18558h = i10;
                    colorDrawable.setColor(i10);
                    b bVar = aVar.f18552b;
                    bVar.f18563e = colorDrawable;
                    qh.c cVar = bVar.f18567i;
                    if (cVar != null) {
                        ((View) cVar.f13508c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i10;
        l4.b bVarC;
        ArrayList arrayList = this.f18568a;
        l4.b bVar = l4.b.f9966e;
        l4.b bVarA = bVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            l4.b bVar2 = this.f18570c;
            l4.b bVar3 = this.f18571d;
            aVar.f18553c = bVar2;
            b bVar4 = aVar.f18552b;
            aVar.f18554d = bVar3;
            if (!bVar4.f18561c.equals(bVarA)) {
                bVar4.f18561c = bVarA;
                qh.c cVar = bVar4.f18567i;
                if (cVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cVar.f13507b;
                    layoutParams.leftMargin = bVarA.f9967a;
                    layoutParams.topMargin = bVarA.f9968b;
                    layoutParams.rightMargin = bVarA.f9969c;
                    layoutParams.bottomMargin = bVarA.f9970d;
                    ((View) cVar.f13508c).setLayoutParams(layoutParams);
                }
            }
            int i11 = aVar.f18551a;
            if (i11 == 1) {
                i10 = aVar.f18553c.f9967a;
                int i12 = aVar.f18554d.f9967a;
                if (bVar4.f18559a != i12) {
                    bVar4.f18559a = i12;
                    qh.c cVar2 = bVar4.f18567i;
                    if (cVar2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cVar2.f13507b;
                        layoutParams2.width = i12;
                        ((View) cVar2.f13508c).setLayoutParams(layoutParams2);
                    }
                }
                bVarC = l4.b.c(i10, 0, 0, 0);
            } else if (i11 == 2) {
                i10 = aVar.f18553c.f9968b;
                int i13 = aVar.f18554d.f9968b;
                if (bVar4.f18560b != i13) {
                    bVar4.f18560b = i13;
                    qh.c cVar3 = bVar4.f18567i;
                    if (cVar3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) cVar3.f13507b;
                        layoutParams3.height = i13;
                        ((View) cVar3.f13508c).setLayoutParams(layoutParams3);
                    }
                }
                bVarC = l4.b.c(0, i10, 0, 0);
            } else if (i11 == 4) {
                i10 = aVar.f18553c.f9969c;
                int i14 = aVar.f18554d.f9969c;
                if (bVar4.f18559a != i14) {
                    bVar4.f18559a = i14;
                    qh.c cVar4 = bVar4.f18567i;
                    if (cVar4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) cVar4.f13507b;
                        layoutParams4.width = i14;
                        ((View) cVar4.f13508c).setLayoutParams(layoutParams4);
                    }
                }
                bVarC = l4.b.c(0, 0, i10, 0);
            } else if (i11 != 8) {
                bVarC = bVar;
                i10 = 0;
            } else {
                i10 = aVar.f18553c.f9970d;
                int i15 = aVar.f18554d.f9970d;
                if (bVar4.f18560b != i15) {
                    bVar4.f18560b = i15;
                    qh.c cVar5 = bVar4.f18567i;
                    if (cVar5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) cVar5.f13507b;
                        layoutParams5.height = i15;
                        ((View) cVar5.f13508c).setLayoutParams(layoutParams5);
                    }
                }
                bVarC = l4.b.c(0, 0, 0, i10);
            }
            boolean z2 = i10 > 0;
            if (bVar4.f18562d != z2) {
                bVar4.f18562d = z2;
                qh.c cVar6 = bVar4.f18567i;
                if (cVar6 != null) {
                    ((View) cVar6.f13508c).setVisibility(z2 ? 0 : 4);
                }
            }
            float f10 = 0.0f;
            aVar.a(i10 > 0 ? 1.0f : 0.0f);
            if (i10 > 0) {
                f10 = 1.0f;
            }
            aVar.b(f10);
            bVarA = l4.b.a(bVarA, bVarC);
        }
    }
}
