package d3;

import c2.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends fj.m implements ej.e {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l E;
    public static final l F;
    public static final l G;
    public static final l H;
    public static final l I;
    public static final l J;
    public static final l K;
    public static final l L;
    public static final l M;
    public static final l N;
    public static final l O;

    /* renamed from: b, reason: collision with root package name */
    public static final l f4726b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f4727c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f4728d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f4729e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f4730f;

    /* renamed from: z, reason: collision with root package name */
    public static final l f4731z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4732a;

    static {
        int i10 = 2;
        f4726b = new l(i10, 0);
        f4727c = new l(i10, 1);
        f4728d = new l(i10, 2);
        f4729e = new l(i10, 3);
        f4730f = new l(i10, 4);
        f4731z = new l(i10, 5);
        A = new l(i10, 6);
        B = new l(i10, 7);
        C = new l(i10, 8);
        D = new l(i10, 9);
        E = new l(i10, 10);
        F = new l(i10, 11);
        G = new l(i10, 12);
        H = new l(i10, 13);
        I = new l(i10, 14);
        J = new l(i10, 15);
        K = new l(i10, 16);
        L = new l(i10, 17);
        M = new l(i10, 18);
        N = new l(i10, 19);
        O = new l(i10, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f4732a = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        pi.c cVar;
        switch (this.f4732a) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = qi.s.f13520a;
                }
                return qi.l.I0(collection, list);
            case 1:
                return (w1.d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListT0 = qi.l.T0(list2);
                arrayListT0.addAll(list3);
                return arrayListT0;
            case 3:
                return (w1.m) obj;
            case 4:
                return (w1.f) obj;
            case 5:
                return (pi.o) obj;
            case 6:
                return (pi.o) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (pi.o) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                j jVar = (j) obj;
                int i10 = ((j) obj2).f4723a;
                return jVar;
            case 12:
                return (w0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListT02 = qi.l.T0(list4);
                arrayListT02.addAll(list5);
                return arrayListT02;
            case 15:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f4703a) == null) {
                    str = aVar2.f4703a;
                }
                if (aVar == null || (cVar = aVar.f4704b) == null) {
                    cVar = aVar2.f4704b;
                }
                return new a(str, cVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                r rVar = (r) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                n nVar = ((r) obj).f4766d;
                y yVar = v.f4795u;
                Object objG = nVar.f4758a.g(yVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = rVar.f4766d.f4758a.g(yVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
