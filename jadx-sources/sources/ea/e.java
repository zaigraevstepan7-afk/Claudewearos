package ea;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.e0;
import fc.s;
import fj.l;
import ja.j;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import t.m1;
import t4.d0;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5842a;

    public /* synthetic */ e(int i10) {
        this.f5842a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5842a) {
            case 0:
                throw m1.f(obj);
            case 1:
                ee.b bVar = (ee.b) obj;
                ee.b bVar2 = (ee.b) obj2;
                e0.i(bVar);
                e0.i(bVar2);
                int i10 = bVar.f5928a;
                int i11 = bVar2.f5928a;
                if (i10 == i11) {
                    int i12 = bVar.f5929b;
                    int i13 = bVar2.f5929b;
                    if (i12 == i13) {
                        return 0;
                    }
                    if (i12 >= i13) {
                        return 1;
                    }
                } else if (i10 >= i11) {
                    return 1;
                }
                return -1;
            case 2:
                Field field = l0.f15744a;
                float f10 = d0.f((View) obj);
                float f11 = d0.f((View) obj2);
                if (f10 > f11) {
                    return -1;
                }
                return f10 < f11 ? 1 : 0;
            case 3:
                return mk.b.l(((u9.a) obj).f16869a, ((u9.a) obj2).f16869a);
            case 4:
                return mk.b.l(((lk.h) obj).f11017a, ((lk.h) obj2).f11017a);
            case 5:
                return mk.b.l(Integer.valueOf(((na.b) obj2).f11970c), Integer.valueOf(((na.b) obj).f11970c));
            case 6:
                return mk.b.l(Float.valueOf(((mi.c) obj).f11739c.g()), Float.valueOf(((mi.c) obj2).f11739c.g()));
            case 7:
                List list = s.f6710b;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 8:
                return mk.b.l(((j) obj).f8784a, ((j) obj2).f8784a);
            case 9:
                String str = ((xa.f) obj).f19864c.f19856b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                l.e(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((xa.f) obj2).f19864c.f19856b.toLowerCase(locale);
                l.e(lowerCase2, "toLowerCase(...)");
                return mk.b.l(lowerCase, lowerCase2);
            case 10:
                String str2 = ((xa.f) obj).f19864c.f19856b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                l.e(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((xa.f) obj2).f19864c.f19856b.toLowerCase(locale2);
                l.e(lowerCase4, "toLowerCase(...)");
                return mk.b.l(lowerCase3, lowerCase4);
            case 11:
                return mk.b.l(Long.valueOf(((ra.c) obj2).f13949b), Long.valueOf(((ra.c) obj).f13949b));
            case 12:
                t6.l lVar = (t6.l) obj;
                t6.l lVar2 = (t6.l) obj2;
                RecyclerView recyclerView = lVar.f15959d;
                if ((recyclerView == null) == (lVar2.f15959d == null)) {
                    boolean z2 = lVar.f15956a;
                    if (z2 == lVar2.f15956a) {
                        int i14 = lVar2.f15957b - lVar.f15957b;
                        if (i14 != 0) {
                            return i14;
                        }
                        int i15 = lVar.f15958c - lVar2.f15958c;
                        if (i15 != 0) {
                            return i15;
                        }
                        return 0;
                    }
                    if (!z2) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 13:
                return ((y3.f) obj).f20197b - ((y3.f) obj2).f20197b;
            case 14:
                return mk.b.l((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 15:
                return mk.b.l((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 16:
                return mk.b.l(((z6.b) obj).f20440a, ((z6.b) obj2).f20440a);
            case 17:
                return mk.b.l(((z6.d) obj).f20452a, ((z6.d) obj2).f20452a);
            case 18:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return ((zg.c) obj).compareTo((zg.c) obj2);
        }
    }
}
