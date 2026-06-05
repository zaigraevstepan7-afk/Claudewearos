package wa;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import f1.q2;
import f1.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import lb.d3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f19120a = 12;

    /* renamed from: b, reason: collision with root package name */
    public static final float f19121b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final float f19122c = 18;

    /* renamed from: d, reason: collision with root package name */
    public static final float f19123d = 40;

    /* JADX WARN: Removed duplicated region for block: B:296:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final v1.o r69, final ib.p0 r70, final java.util.List r71, final mi.p r72, final lb.t3 r73, final java.lang.Integer r74, final java.lang.String r75, final java.util.Set r76, final boolean r77, final boolean r78, final boolean r79, final boolean r80, final ej.f r81, final ej.c r82, final ej.e r83, final ej.c r84, final ej.a r85, final ej.c r86, final tj.e r87, final ej.f r88, final ej.c r89, f1.i0 r90, final int r91) {
        /*
            Method dump skipped, instructions count: 2868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.l0.a(v1.o, ib.p0, java.util.List, mi.p, lb.t3, java.lang.Integer, java.lang.String, java.util.Set, boolean, boolean, boolean, boolean, ej.f, ej.c, ej.e, ej.c, ej.a, ej.c, tj.e, ej.f, ej.c, f1.i0, int):void");
    }

    public static final float b(q2 q2Var) {
        return ((Number) q2Var.getValue()).floatValue();
    }

    public static final void c(final v1.o oVar, final xa.f fVar, final int i10, final int i11, final float f10, float f11, f1.i0 i0Var, final int i12, final int i13) {
        float f12;
        int i14;
        final float f13;
        i0Var.c0(646263);
        int i15 = i12 | (i0Var.f(oVar) ? 4 : 2) | (i0Var.f(fVar) ? 32 : 16) | (i0Var.d(i10) ? 256 : 128) | (i0Var.c(f10) ? 16384 : 8192);
        int i16 = i13 & 32;
        if (i16 != 0) {
            i14 = i15 | 196608;
            f12 = f11;
        } else {
            f12 = f11;
            i14 = i15 | (i0Var.c(f12) ? 131072 : 65536);
        }
        if (i0Var.T(i14 & 1, (73875 & i14) != 73874)) {
            float f14 = i16 != 0 ? 1.0f : f12;
            final xa.b bVar = (xa.b) i0Var.j(xa.c.f19854a);
            boolean z2 = (458752 & i14) == 131072;
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (z2 || objQ == obj) {
                objQ = new d3(f14, 1);
                i0Var.l0(objQ);
            }
            v1.o oVarQ = c2.e0.q(oVar, (ej.c) objQ);
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = new ta.n(23);
                i0Var.l0(objQ2);
            }
            ej.c cVar = (ej.c) objQ2;
            boolean zF = ((i14 & 112) == 32) | i0Var.f(bVar) | ((i14 & 896) == 256) | ((i14 & 57344) == 16384);
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new ej.c() { // from class: wa.u
                    @Override // ej.c
                    public final Object invoke(Object obj2) {
                        xa.b bVar2;
                        View view = (View) obj2;
                        fj.l.f(view, "view");
                        ImageView imageView = (ImageView) view.findViewById(R.id.app_icon_image);
                        TextView textView = (TextView) view.findViewById(R.id.icon_label);
                        View viewFindViewById = view.findViewById(R.id.app_icon_selection_badge);
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.app_icon_selection_badge_check);
                        xa.b bVar3 = bVar;
                        if (bVar3 == null) {
                            Context context = view.getContext();
                            fj.l.e(context, "getContext(...)");
                            Resources resources = context.getResources();
                            bVar2 = new xa.b(r5.m() / 100.0f, r5.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context).n());
                        } else {
                            bVar2 = bVar3;
                        }
                        xa.f fVar2 = fVar;
                        xa.d dVar = fVar2.f19864c;
                        Boolean bool = fVar2.f19865d;
                        xa.b bVarA = dVar.f19858d == xa.e.f19860b ? xa.b.a(bVar2, 0.27f, lb.b.f10142b) : bVar2;
                        fj.l.c(imageView);
                        xa.a.a(imageView, i10, bVarA, null, null, 56);
                        Bitmap bitmap = dVar.f19855a;
                        String str = dVar.f19856b;
                        imageView.setImageBitmap(bitmap);
                        imageView.setContentDescription(str);
                        fj.l.c(textView);
                        xa.a.b(textView, str, bVar2);
                        float f15 = f10;
                        textView.setAlpha(f15);
                        if (bool != null) {
                            viewFindViewById.setVisibility(0);
                            viewFindViewById.setAlpha(f15);
                            Boolean bool2 = Boolean.TRUE;
                            viewFindViewById.setBackgroundResource(bool.equals(bool2) ? R.drawable.bg_selection_badge_selected : R.drawable.bg_selection_badge_unselected);
                            imageView2.setColorFilter(bool.equals(bool2) ? -1 : -12303292);
                        } else {
                            viewFindViewById.setVisibility(8);
                            viewFindViewById.setAlpha(1.0f);
                        }
                        return pi.o.f13011a;
                    }
                };
                i0Var.l0(objQ3);
            }
            v3.j.a(6, 0, cVar, (ej.c) objQ3, i0Var, oVarQ);
            f13 = f14;
        } else {
            i0Var.W();
            f13 = f12;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(fVar, i10, i11, f10, f13, i12, i13) { // from class: wa.v

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ xa.f f19188b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f19189c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f19190d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f19191e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f19192f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ int f19193z;

                {
                    this.f19193z = i13;
                }

                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iO = f1.s.O(1);
                    l0.c(this.f19187a, this.f19188b, this.f19189c, this.f19190d, this.f19191e, this.f19192f, (f1.i0) obj2, iO, this.f19193z);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final p0 d(List list, Integer num, Integer num2, int i10) {
        if (num != null) {
            int size = list.size();
            int iIntValue = num.intValue();
            if (iIntValue >= 0 && iIntValue < size) {
                String str = (String) list.get(num.intValue());
                if (str == null) {
                    return new p0(list, false);
                }
                int iIntValue2 = num.intValue();
                if (num2 != null && num2.intValue() == iIntValue2) {
                    return new p0(list, true);
                }
                ArrayList arrayListT0 = qi.l.T0(list);
                arrayListT0.set(num.intValue(), null);
                if (num2 != null) {
                    int size2 = arrayListT0.size();
                    int iIntValue3 = num2.intValue();
                    if (iIntValue3 >= 0 && iIntValue3 < size2) {
                        if (arrayListT0.get(num2.intValue()) == null) {
                            arrayListT0.set(num2.intValue(), str);
                            return new p0(arrayListT0, true);
                        }
                        int iIntValue4 = (num2.intValue() / i10) * i10;
                        kj.h hVarT = cg.b.T(iIntValue4, Math.min(i10 + iIntValue4, arrayListT0.size()));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = hVarT.iterator();
                        while (true) {
                            kj.g gVar = (kj.g) it;
                            if (!gVar.f9670c) {
                                break;
                            }
                            Object next = gVar.next();
                            if (arrayListT0.get(((Number) next).intValue()) == null) {
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new p0(arrayListT0, false);
                        }
                        Iterator it2 = arrayList.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next2 = it2.next();
                        if (it2.hasNext()) {
                            int iAbs = Math.abs(((Number) next2).intValue() - num2.intValue());
                            do {
                                Object next3 = it2.next();
                                int iAbs2 = Math.abs(((Number) next3).intValue() - num2.intValue());
                                if (iAbs > iAbs2) {
                                    next2 = next3;
                                    iAbs = iAbs2;
                                }
                            } while (it2.hasNext());
                        }
                        int iIntValue5 = ((Number) next2).intValue();
                        if (iIntValue5 < num2.intValue()) {
                            int iIntValue6 = num2.intValue();
                            while (iIntValue5 < iIntValue6) {
                                int i11 = iIntValue5 + 1;
                                arrayListT0.set(iIntValue5, arrayListT0.get(i11));
                                iIntValue5 = i11;
                            }
                        } else {
                            int iIntValue7 = num2.intValue() + 1;
                            if (iIntValue7 <= iIntValue5) {
                                while (true) {
                                    arrayListT0.set(iIntValue5, arrayListT0.get(iIntValue5 - 1));
                                    if (iIntValue5 == iIntValue7) {
                                        break;
                                    }
                                    iIntValue5--;
                                }
                            }
                        }
                        arrayListT0.set(num2.intValue(), str);
                        return new p0(arrayListT0, true);
                    }
                }
                return new p0(arrayListT0, false);
            }
        }
        return new p0(list, false);
    }
}
