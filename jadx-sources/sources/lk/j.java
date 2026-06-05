package lk;

import fj.v;
import java.io.IOException;
import kk.x;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11040a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f11041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f11042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f11043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f11044e;

    public /* synthetic */ j(v vVar, x xVar, v vVar2, v vVar3) {
        this.f11041b = vVar;
        this.f11042c = xVar;
        this.f11043d = vVar2;
        this.f11044e = vVar3;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i10 = this.f11040a;
        int iIntValue = ((Integer) obj).intValue();
        Long l10 = (Long) obj2;
        switch (i10) {
            case 0:
                long jLongValue = l10.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    x xVar = this.f11042c;
                    byte b10 = xVar.readByte();
                    boolean z2 = (b10 & 1) == 1;
                    boolean z10 = (b10 & 2) == 2;
                    boolean z11 = (b10 & 4) == 4;
                    long j = z2 ? 5L : 1L;
                    if (z10) {
                        j += 4;
                    }
                    if (z11) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z2) {
                        this.f11041b.f6807a = Integer.valueOf(xVar.l());
                    }
                    if (z10) {
                        this.f11043d.f6807a = Integer.valueOf(xVar.l());
                    }
                    if (z11) {
                        this.f11044e.f6807a = Integer.valueOf(xVar.l());
                    }
                }
                return o.f13011a;
            default:
                long jLongValue2 = l10.longValue();
                if (iIntValue == 1) {
                    v vVar = this.f11041b;
                    if (vVar.f6807a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    x xVar2 = this.f11042c;
                    vVar.f6807a = Long.valueOf(xVar2.n());
                    this.f11043d.f6807a = Long.valueOf(xVar2.n());
                    this.f11044e.f6807a = Long.valueOf(xVar2.n());
                }
                return o.f13011a;
        }
    }

    public /* synthetic */ j(x xVar, v vVar, v vVar2, v vVar3) {
        this.f11042c = xVar;
        this.f11041b = vVar;
        this.f11043d = vVar2;
        this.f11044e = vVar3;
    }
}
