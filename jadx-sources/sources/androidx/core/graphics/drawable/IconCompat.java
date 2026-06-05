package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i4.a;
import i4.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f869k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f870a;

    /* renamed from: b, reason: collision with root package name */
    public Object f871b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f872c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f873d;

    /* renamed from: e, reason: collision with root package name */
    public int f874e;

    /* renamed from: f, reason: collision with root package name */
    public int f875f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f876g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f877h;

    /* renamed from: i, reason: collision with root package name */
    public String f878i;
    public String j;

    public IconCompat() {
        this.f870a = -1;
        this.f872c = null;
        this.f873d = null;
        this.f874e = 0;
        this.f875f = 0;
        this.f876g = null;
        this.f877h = f869k;
        this.f878i = null;
    }

    public static IconCompat a(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f874e = i10;
        iconCompat.f871b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int b() {
        int i10 = this.f870a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f874e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f871b;
        if (i11 >= 28) {
            return a.h(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final int c() {
        int i10 = this.f870a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f871b;
        if (i11 >= 28) {
            return a.o(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public final Uri d() {
        int i10 = this.f870a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f871b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f871b;
        if (i11 >= 28) {
            return a.p(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon e(Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f870a;
        String strI = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strI = null;
        strI = null;
        switch (i11) {
            case -1:
                return (Icon) this.f871b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f871b);
                break;
            case 2:
                if (i11 == -1) {
                    Object obj = this.f871b;
                    if (i10 >= 28) {
                        strI = a.i(obj);
                    } else {
                        try {
                            strI = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.j;
                    strI = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f871b).split(":", -1)[0] : this.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strI, this.f874e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f871b, this.f874e, this.f875f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f871b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f871b);
                break;
            case 6:
                if (i10 >= 30) {
                    iconCreateWithBitmap = b.b(d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + d());
                    }
                    Uri uriD = d();
                    String scheme = uriD.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriD);
                        } catch (Exception e13) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriD, e13);
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f871b));
                        } catch (FileNotFoundException e14) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriD, e14);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + d());
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = this.f876g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f877h;
        if (mode != f869k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f870a == -1) {
            return String.valueOf(this.f871b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f870a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f870a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f871b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f871b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f874e);
                if (this.f875f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f875f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f871b);
                break;
        }
        if (this.f876g != null) {
            sb2.append(" tint=");
            sb2.append(this.f876g);
        }
        if (this.f877h != f869k) {
            sb2.append(" mode=");
            sb2.append(this.f877h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f872c = null;
        this.f873d = null;
        this.f874e = 0;
        this.f875f = 0;
        this.f876g = null;
        this.f877h = f869k;
        this.f878i = null;
        this.f870a = i10;
    }
}
