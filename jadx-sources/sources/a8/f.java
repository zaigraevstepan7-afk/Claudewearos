package a8;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    public static final String f203f = m.l("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final f8.a f204a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f205b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f206c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f207d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f208e;

    public f(Context context, f8.a aVar) {
        this.f205b = context.getApplicationContext();
        this.f204a = aVar;
    }

    public abstract Object a();

    public final void b(z7.c cVar) {
        synchronized (this.f206c) {
            try {
                if (this.f207d.remove(cVar) && this.f207d.isEmpty()) {
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f206c) {
            try {
                Object obj2 = this.f208e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f208e = obj;
                    ((f8.b) ((ac.d) this.f204a).f375d).execute(new e(0, this, new ArrayList(this.f207d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
