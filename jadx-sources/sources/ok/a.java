package ok;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.LinearLayout;
import ej.c;
import ej.e;
import fj.f;
import fj.l;
import fj.w;
import java.util.List;
import pi.o;
import uk.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12549b;

    public /* synthetic */ a(Context context, int i10) {
        this.f12548a = i10;
        this.f12549b = context;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f12548a) {
            case 0:
                wk.a aVar = (wk.a) obj;
                l.f(aVar, "$this$module");
                final Context context = this.f12549b;
                if (context instanceof Application) {
                    final int i10 = 0;
                    e eVar = new e() { // from class: ok.b
                        @Override // ej.e
                        public final Object invoke(Object obj2, Object obj3) {
                            cl.a aVar2 = (cl.a) obj2;
                            yk.a aVar3 = (yk.a) obj3;
                            switch (i10) {
                                case 0:
                                    l.f(aVar2, "$this$single");
                                    l.f(aVar3, "it");
                                    return (Application) context;
                                default:
                                    l.f(aVar2, "$this$single");
                                    l.f(aVar3, "it");
                                    return context;
                            }
                        }
                    };
                    sk.b bVar = sk.b.f15087a;
                    f fVarA = w.a(Application.class);
                    zk.b bVar2 = al.a.f764e;
                    sk.a aVar2 = new sk.a(bVar2, fVarA, null, eVar, bVar);
                    d dVar = new d(aVar2);
                    aVar.a(dVar);
                    f fVarA2 = w.a(Context.class);
                    aVar2.f15086f = qi.l.J0((List) aVar2.f15086f, fVarA2);
                    String str = dl.a.a(fVarA2) + "::" + bVar2;
                    l.f(str, "mapping");
                    aVar.f19420c.put(str, dVar);
                } else {
                    final int i11 = 1;
                    aVar.a(new d(new sk.a(al.a.f764e, w.a(Context.class), null, new e() { // from class: ok.b
                        @Override // ej.e
                        public final Object invoke(Object obj2, Object obj3) {
                            cl.a aVar22 = (cl.a) obj2;
                            yk.a aVar3 = (yk.a) obj3;
                            switch (i11) {
                                case 0:
                                    l.f(aVar22, "$this$single");
                                    l.f(aVar3, "it");
                                    return (Application) context;
                                default:
                                    l.f(aVar22, "$this$single");
                                    l.f(aVar3, "it");
                                    return context;
                            }
                        }
                    }, sk.b.f15087a)));
                }
                return o.f13011a;
            case 1:
                String str2 = (String) obj;
                l.f(str2, "packageName");
                Context context2 = this.f12549b;
                Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage(str2);
                if (launchIntentForPackage != null) {
                    context2.startActivity(launchIntentForPackage);
                }
                return o.f13011a;
            default:
                l.f((Context) obj, "it");
                LinearLayout linearLayout = new LinearLayout(this.f12549b);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                return linearLayout;
        }
    }
}
