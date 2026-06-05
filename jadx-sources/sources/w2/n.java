package w2;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f18331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(t tVar, int i10) {
        super(0);
        this.f18330a = i10;
        this.f18331b = tVar;
    }

    @Override // ej.a
    public final Object a() {
        int actionMasked;
        switch (this.f18330a) {
            case 0:
                Boolean bool = (Boolean) this.f18331b.J.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = this.f18331b.getConfiguration().getLocales();
                p4.e eVar = new p4.e(new p4.f(locales));
                if (locales.isEmpty()) {
                    eVar = new p4.e(new p4.f(LocaleList.getDefault()));
                }
                p4.f fVar = eVar.f12794a;
                int size = fVar.f12795a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Locale locale = fVar.f12795a.get(i10);
                    fj.l.c(locale);
                    arrayList.add(new n3.a(locale));
                }
                return new n3.b(arrayList);
            case 2:
                t tVar = this.f18331b;
                MotionEvent motionEvent = tVar.P0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    tVar.Q0 = SystemClock.uptimeMillis();
                    tVar.post(tVar.V0);
                }
                return pi.o.f13011a;
            default:
                this.f18331b.get_viewTreeOwners();
                return null;
        }
    }
}
