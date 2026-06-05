package i2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8196a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8197b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8198c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8199d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8200e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8201f;

    /* renamed from: g, reason: collision with root package name */
    public final float f8202g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8203h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8204i;
    public final ArrayList j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = h0.f8270a;
            list = qi.s.f13520a;
        }
        ArrayList arrayList = new ArrayList();
        this.f8196a = str;
        this.f8197b = f10;
        this.f8198c = f11;
        this.f8199d = f12;
        this.f8200e = f13;
        this.f8201f = f14;
        this.f8202g = f15;
        this.f8203h = f16;
        this.f8204i = list;
        this.j = arrayList;
    }
}
