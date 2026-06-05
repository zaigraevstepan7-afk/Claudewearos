package c;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1831d;

    public /* synthetic */ k(Object obj, int i10, int i11, Object obj2) {
        this.f1828a = i11;
        this.f1829b = obj;
        this.f1830c = i10;
        this.f1831d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1828a) {
            case 0:
                l lVar = (l) this.f1829b;
                Object obj = ((h.a) this.f1831d).f7555a;
                String str = (String) lVar.f1832a.get(Integer.valueOf(this.f1830c));
                if (str != null) {
                    g.d dVar = (g.d) lVar.f1836e.get(str);
                    if ((dVar != null ? dVar.f6837a : null) != null) {
                        g.b bVar = dVar.f6837a;
                        if (lVar.f1835d.remove(str)) {
                            bVar.b(obj);
                            break;
                        }
                    } else {
                        lVar.f1838g.remove(str);
                        lVar.f1837f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((l) this.f1829b).a(this.f1830c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1831d));
                break;
            default:
                ((r6.a) this.f1829b).f13779b.g(this.f1830c, this.f1831d);
                break;
        }
    }
}
