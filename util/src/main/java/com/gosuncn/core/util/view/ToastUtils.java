package com.gosuncn.core.util.view;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by leo on 2016/11/21
 * description: toast 工具类
 */
public class ToastUtils {

	/**
	 * 吐出指定的视图，使其显示较长的时间
	 * @param context 上下文
	 * @param view     视图
	 */
	public static void showLongToast(Context context, View view){
		Toast toast = new Toast(context);
		toast.setView(view);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.show();
	}
	
	/**
	 * 吐出指定的视图，使其显示较短的时间
	 * @param context 上下文
	 * @param view     视图
	 */
	public static void showShortToast(Context context, View view){
		Toast toast = new Toast(context);
		toast.setView(view);
		toast.setDuration(Toast.LENGTH_SHORT);
		toast.show();
	}
	
	/**
	 * 吐出一个显示时间较长的提示
	 * @param context 上下文对象
	 * @param resId 显示内容资源ID
	 */
	public static void showLongToast(Context context, int resId){
		Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
	}

	/**
	 * 吐出一个显示时间较短的提示
	 * @param context 上下文对象
	 * @param resId 显示内容资源ID
	 */
	public static void showShortToast(Context context, int resId){
		Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
	}

	/**
	 * 吐出一个显示时间较长的提示
	 * @param context 上下文对象
	 * @param content 显示内容
	 */
	public static void showLongToast(Context context, String content){
		Toast.makeText(context, content, Toast.LENGTH_LONG).show();
	}

	/**
	 * 吐出一个显示时间较短的提示
	 * @param context 上下文对象
	 * @param content 显示内容
	 */
	public static void showShortToast(Context context, String content){
		Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
	}

	/**
	 * 吐出一个显示时间较长的提示
	 * @param context 上下文对象
	 * @param formatResId 被格式化的字符串资源的ID
	 * @param args 参数数组
	 */
	public static void showLongToast(Context context, int formatResId, Object... args){
		Toast.makeText(context, String.format(context.getString(formatResId), args), Toast.LENGTH_LONG).show();
	}

	/**
	 * 吐出一个显示时间较短的提示
	 * @param context 上下文对象
	 * @param formatResId 被格式化的字符串资源的ID
	 * @param args 参数数组
	 */
	public static void showShortToast(Context context, int formatResId, Object... args){
		Toast.makeText(context, String.format(context.getString(formatResId), args), Toast.LENGTH_SHORT).show();
	}

	/**
	 * 吐出一个显示时间较长的提示
	 * @param context 上下文对象
	 * @param format 被格式化的字符串
	 * @param args 参数数组
	 */
	public static void showLongToast(Context context, String format, Object... args){
		Toast.makeText(context, String.format(format, args), Toast.LENGTH_LONG).show();
	}

	/**
	 * 吐出一个显示时间较短的提示
	 * @param context 上下文对象
	 * @param format 被格式化的字符串
	 * @param args 参数数组
	 */
	public static void showShortToast(Context context, String format, Object... args){
		Toast.makeText(context, String.format(format, args), Toast.LENGTH_SHORT).show();
	}
	
}