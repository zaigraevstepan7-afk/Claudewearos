package ef;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f5982a;

    /* renamed from: b, reason: collision with root package name */
    public z f5983b;

    /* renamed from: c, reason: collision with root package name */
    public ye.a f5984c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f5985d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f5986e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f5987f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f5988g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f5989h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5990i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f5991k;

    /* renamed from: l, reason: collision with root package name */
    public int f5992l;

    /* renamed from: m, reason: collision with root package name */
    public float f5993m;

    /* renamed from: n, reason: collision with root package name */
    public float f5994n;

    /* renamed from: o, reason: collision with root package name */
    public int f5995o;

    /* renamed from: p, reason: collision with root package name */
    public int f5996p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f5997q;

    public g(m mVar) {
        this.f5985d = null;
        this.f5986e = null;
        this.f5987f = null;
        this.f5988g = PorterDuff.Mode.SRC_IN;
        this.f5989h = null;
        this.f5990i = 1.0f;
        this.j = 1.0f;
        this.f5992l = 255;
        this.f5993m = 0.0f;
        this.f5994n = 0.0f;
        this.f5995o = 0;
        this.f5996p = 0;
        this.f5997q = Paint.Style.FILL_AND_STROKE;
        this.f5982a = mVar;
        this.f5984c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f6004f = true;
        iVar.f6005z = true;
        return iVar;
    }

    public g(g gVar) {
        this.f5985d = null;
        this.f5986e = null;
        this.f5987f = null;
        this.f5988g = PorterDuff.Mode.SRC_IN;
        this.f5989h = null;
        this.f5990i = 1.0f;
        this.j = 1.0f;
        this.f5992l = 255;
        this.f5993m = 0.0f;
        this.f5994n = 0.0f;
        this.f5995o = 0;
        this.f5996p = 0;
        this.f5997q = Paint.Style.FILL_AND_STROKE;
        this.f5982a = gVar.f5982a;
        this.f5983b = gVar.f5983b;
        this.f5984c = gVar.f5984c;
        this.f5991k = gVar.f5991k;
        this.f5985d = gVar.f5985d;
        this.f5986e = gVar.f5986e;
        this.f5988g = gVar.f5988g;
        this.f5987f = gVar.f5987f;
        this.f5992l = gVar.f5992l;
        this.f5990i = gVar.f5990i;
        this.f5996p = gVar.f5996p;
        this.j = gVar.j;
        this.f5993m = gVar.f5993m;
        this.f5994n = gVar.f5994n;
        this.f5995o = gVar.f5995o;
        this.f5997q = gVar.f5997q;
        if (gVar.f5989h != null) {
            this.f5989h = new Rect(gVar.f5989h);
        }
    }
}
