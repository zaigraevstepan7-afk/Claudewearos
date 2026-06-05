package h7;

import fj.l;
import g7.i;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7677d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f7.b bVar, String str, c cVar) {
        super(bVar, str);
        l.f(bVar, "db");
        l.f(str, "sql");
        this.f7678e = cVar;
    }

    @Override // e7.c
    public final String M(int i10) {
        switch (this.f7677d) {
            case 0:
                return ((e) this.f7678e).M(i10);
            case 1:
                b();
                uk.c.S(21, "no row");
                throw null;
            default:
                b();
                uk.c.S(21, "no row");
                throw null;
        }
    }

    @Override // e7.c
    public final boolean a0() {
        switch (this.f7677d) {
            case 0:
                e eVar = (e) this.f7678e;
                boolean zA0 = eVar.a0();
                boolean zEqualsIgnoreCase = eVar.M(0).equalsIgnoreCase("wal");
                f7.b bVar = this.f7683a;
                if (zEqualsIgnoreCase) {
                    bVar.w();
                } else {
                    bVar.i();
                }
                return zA0;
            case 1:
                b();
                ((i) this.f7678e).f7252b.execute();
                return false;
            default:
                int iOrdinal = ((c) this.f7678e).ordinal();
                f7.b bVar2 = this.f7683a;
                if (iOrdinal == 0) {
                    bVar2.z();
                    bVar2.K();
                    return false;
                }
                if (iOrdinal == 1) {
                    bVar2.K();
                    return false;
                }
                if (iOrdinal == 2) {
                    bVar2.f();
                    return false;
                }
                if (iOrdinal == 3) {
                    bVar2.B();
                    return false;
                }
                if (iOrdinal != 4) {
                    throw new b3.e();
                }
                bVar2.p();
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7677d) {
            case 0:
                ((e) this.f7678e).close();
                break;
            case 1:
                ((i) this.f7678e).close();
                this.f7685c = true;
                break;
            default:
                this.f7685c = true;
                break;
        }
    }

    @Override // h7.f, e7.c
    public void d() {
        switch (this.f7677d) {
            case 0:
                ((e) this.f7678e).d();
                break;
            case 1:
                b();
                ((i) this.f7678e).d();
                break;
            default:
                super.d();
                break;
        }
    }

    @Override // e7.c
    public final int getColumnCount() {
        switch (this.f7677d) {
            case 0:
                break;
            case 1:
                b();
                break;
            default:
                b();
                break;
        }
        return 0;
    }

    @Override // e7.c
    public final String getColumnName(int i10) {
        switch (this.f7677d) {
            case 0:
                return ((e) this.f7678e).getColumnName(i10);
            case 1:
                b();
                uk.c.S(21, "no row");
                throw null;
            default:
                b();
                uk.c.S(21, "no row");
                throw null;
        }
    }

    @Override // e7.c
    public final long getLong(int i10) {
        switch (this.f7677d) {
            case 0:
                return ((e) this.f7678e).getLong(i10);
            case 1:
                b();
                uk.c.S(21, "no row");
                throw null;
            default:
                b();
                uk.c.S(21, "no row");
                throw null;
        }
    }

    @Override // e7.c
    public final boolean isNull(int i10) {
        switch (this.f7677d) {
            case 0:
                return ((e) this.f7678e).isNull(i10);
            case 1:
                b();
                uk.c.S(21, "no row");
                throw null;
            default:
                b();
                uk.c.S(21, "no row");
                throw null;
        }
    }

    @Override // h7.f, e7.c
    public void reset() {
        switch (this.f7677d) {
            case 0:
                ((e) this.f7678e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // e7.c
    public boolean x() {
        switch (this.f7677d) {
            case 0:
                return ((e) this.f7678e).x();
            default:
                return super.x();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f7.b bVar, String str, e eVar) {
        super(bVar, str);
        l.f(bVar, "db");
        l.f(str, "sql");
        this.f7678e = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f7.b bVar, String str) {
        super(bVar, str);
        l.f(bVar, "db");
        l.f(str, "sql");
        this.f7678e = bVar.m(str);
    }
}
