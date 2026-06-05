package d3;

import com.google.android.gms.common.api.internal.i0;
import f1.g1;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import v2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4710b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f4709a = i10;
        this.f4710b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4709a) {
            case 0:
                int iCompare = ((Comparator) this.f4710b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return f0.f17621m0.compare(((r) obj).f4765c, ((r) obj2).f4765c);
            case 1:
                int iCompare2 = ((b0) this.f4710b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : mk.b.l(Integer.valueOf(((r) obj).f4768f), Integer.valueOf(((r) obj2).f4768f));
            case 2:
                int iCompare3 = ((ea.e) this.f4710b).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                String str = ((xa.f) obj).f19863b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                fj.l.e(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((xa.f) obj2).f19863b.toLowerCase(locale);
                fj.l.e(lowerCase2, "toLowerCase(...)");
                return mk.b.l(lowerCase, lowerCase2);
            case 3:
                int iCompare4 = ((ea.e) this.f4710b).compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                String str2 = ((xa.f) obj).f19863b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                fj.l.e(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((xa.f) obj2).f19863b.toLowerCase(locale2);
                fj.l.e(lowerCase4, "toLowerCase(...)");
                return mk.b.l(lowerCase3, lowerCase4);
            default:
                int iIntValue = ((Number) ((Map.Entry) obj).getKey()).intValue();
                i0 i0Var = ((g0.d) this.f4710b).f6893d;
                return mk.b.l(Integer.valueOf(Math.abs(iIntValue - ((g1) i0Var.f3553c).g())), Integer.valueOf(Math.abs(((Number) ((Map.Entry) obj2).getKey()).intValue() - ((g1) i0Var.f3553c).g())));
        }
    }

    public b0(Comparator comparator) {
        this.f4709a = 0;
        this.f4710b = comparator;
    }
}
