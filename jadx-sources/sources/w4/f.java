package w4;

import android.graphics.RectF;
import android.view.View;
import androidx.datastore.preferences.protobuf.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t4.m1;
import t4.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f18580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.f18580d = gVar;
        this.f18579c = new HashMap();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void k(v0 v0Var) {
        ArrayList arrayList = this.f18580d.f18582b;
        if ((v0Var.f15784a.d() & 519) != 0) {
            this.f18579c.remove(v0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i10 = cVar.f18572e;
                boolean z2 = i10 > 0;
                int i11 = i10 - 1;
                cVar.f18572e = i11;
                if (z2 && i11 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void l(v0 v0Var) {
        ArrayList arrayList = this.f18580d.f18582b;
        if ((v0Var.f15784a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f18572e++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final m1 m(m1 m1Var, List list) {
        ArrayList arrayList = this.f18580d.f18582b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i10 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            v0 v0Var = (v0) list.get(size);
            Integer num = (Integer) this.f18579c.get(v0Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = v0Var.f15784a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i10 |= iIntValue;
            }
        }
        l4.b bVarB = l4.b.b(m1Var.f15751a.g(519), m1Var.f15751a.g(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            l4.b bVar = cVar.f18571d;
            ArrayList arrayList2 = cVar.f18568a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i11 = aVar.f18551a;
                if ((i11 & i10) != 0) {
                    b bVar2 = aVar.f18552b;
                    if (!bVar2.f18562d) {
                        bVar2.f18562d = true;
                        qh.c cVar2 = bVar2.f18567i;
                        if (cVar2 != null) {
                            ((View) cVar2.f13508c).setVisibility(0);
                        }
                    }
                    if (i11 == 1) {
                        int i12 = bVar.f9967a;
                        if (i12 > 0) {
                            aVar.b(bVarB.f9967a / i12);
                        }
                        aVar.a(rectF.left);
                    } else if (i11 == 2) {
                        int i13 = bVar.f9968b;
                        if (i13 > 0) {
                            aVar.b(bVarB.f9968b / i13);
                        }
                        aVar.a(rectF.top);
                    } else if (i11 == 4) {
                        int i14 = bVar.f9969c;
                        if (i14 > 0) {
                            aVar.b(bVarB.f9969c / i14);
                        }
                        aVar.a(rectF.right);
                    } else if (i11 == 8) {
                        int i15 = bVar.f9970d;
                        if (i15 > 0) {
                            aVar.b(bVarB.f9970d / i15);
                        }
                        aVar.a(rectF.bottom);
                    }
                }
            }
        }
        return m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final q5.b n(v0 v0Var, q5.b bVar) {
        if ((v0Var.f15784a.d() & 519) != 0) {
            l4.b bVar2 = (l4.b) bVar.f13236c;
            l4.b bVar3 = (l4.b) bVar.f13235b;
            int i10 = bVar2.f9967a != bVar3.f9967a ? 1 : 0;
            if (bVar2.f9968b != bVar3.f9968b) {
                i10 |= 2;
            }
            if (bVar2.f9969c != bVar3.f9969c) {
                i10 |= 4;
            }
            if (bVar2.f9970d != bVar3.f9970d) {
                i10 |= 8;
            }
            this.f18579c.put(v0Var, Integer.valueOf(i10));
        }
        return bVar;
    }
}
