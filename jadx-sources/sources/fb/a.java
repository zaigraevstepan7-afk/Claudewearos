package fb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.InputStream;
import pi.j;
import pi.o;
import qj.z;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6656a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f6658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f6659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, Uri uri, ti.c cVar, int i10) {
        super(2, cVar);
        this.f6656a = i10;
        this.f6658c = context;
        this.f6659d = uri;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f6656a) {
            case 0:
                a aVar = new a(this.f6658c, this.f6659d, cVar, 0);
                aVar.f6657b = obj;
                return aVar;
            default:
                a aVar2 = new a(this.f6658c, this.f6659d, cVar, 1);
                aVar2.f6657b = obj;
                return aVar2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f6656a) {
        }
        return ((a) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object objR;
        InputStream inputStreamOpenInputStream;
        Object objR2;
        int i10 = this.f6656a;
        Uri uri = this.f6659d;
        Context context = this.f6658c;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                            objR = bitmapDecodeStream != null ? new c2.g(bitmapDecodeStream) : null;
                            inputStreamOpenInputStream.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        objR = null;
                    }
                } catch (Throwable th2) {
                    objR = uk.c.r(th2);
                }
                if (objR instanceof j) {
                    return null;
                }
                return objR;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                            objR2 = bitmapDecodeStream2 != null ? new c2.g(bitmapDecodeStream2) : null;
                            inputStreamOpenInputStream.close();
                        } finally {
                        }
                    } else {
                        objR2 = null;
                    }
                } catch (Throwable th3) {
                    objR2 = uk.c.r(th3);
                }
                if (objR2 instanceof j) {
                    return null;
                }
                return objR2;
        }
    }
}
