package tg;

import java.util.concurrent.Callable;
import s8.h;
import ug.l;
import v8.e;
import zg.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16329a;

    public a(boolean z2) {
        this.f16329a = z2;
    }

    @Override // v8.e
    public boolean a(h hVar) {
        return this.f16329a;
    }

    @Override // v8.e
    public boolean b() {
        return this.f16329a;
    }

    public Object c(Callable callable) {
        l.b("runInTransaction called when an existing transaction is already in progress.", !this.f16329a);
        this.f16329a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    public wg.a d(wg.h hVar) {
        return new wg.a(new zg.l(j.f20603e, hVar.f19306b.f19304e), false, false);
    }

    public void e() {
        l.b("Transaction expected to already be in progress.", this.f16329a);
    }

    public a() {
        this.f16329a = false;
    }
}
